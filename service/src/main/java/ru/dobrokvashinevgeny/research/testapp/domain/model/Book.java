/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.testapp.domain.model;

/**
 * Класс Book
 */
public class Book {
	private long id;

	private String name;

	public Book(String name) {
		this.name = name;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public long getId() {
		return id;
	}

	/**
	 * Устанавливает
	 *
	 */
	public void setId(long id) {
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
	 *
	 */
	public void setName(String name) {
		this.name = name;
	}
}