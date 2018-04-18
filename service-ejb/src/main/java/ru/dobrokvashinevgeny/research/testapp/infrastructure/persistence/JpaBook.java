/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.testapp.infrastructure.persistence;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Класс JpaBook
 */
@Entity
@Table(name = "Book")
public class JpaBook {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(updatable = false, nullable = false)
	private Long id;

	@NotNull
	@Column(nullable = false)
	private String name;

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Устанавливает
	 *
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Устанавливает
	 */
	public void setName(String name) {
		this.name = name;
	}
}