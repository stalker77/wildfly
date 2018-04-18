/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.testapp.infrastructure.persistence;

import ru.dobrokvashinevgeny.research.testapp.domain.model.*;

import javax.persistence.*;
import java.util.*;

/**
 * Класс JpaBookRepository
 */
public class JpaBookRepository implements BookRepository {
	@PersistenceContext(unitName = "ru.dobrokvashinevgeny.research.jpa")
	private EntityManager entityManager;

	@Override
	public List<Book> allBooks() {
		Query query = entityManager.createQuery("from JpaBook");
		List<JpaBook> jpaBooks = (List<JpaBook>) query.getResultList();

		List<Book> result = new ArrayList<>();
		for (JpaBook jpaBook : jpaBooks) {
			result.add(bookFromJpaBook(jpaBook));
		}

		return result;
	}

	private Book bookFromJpaBook(JpaBook jpaBook) {
		final Book book = new Book(jpaBook.getName());
		book.setId(jpaBook.getId());

		return book;
	}

	@Override
	public void save(Book newBook) {
		final JpaBook jpaBook = jpaBookFromBook(newBook);
		entityManager.persist(jpaBook);
		entityManager.flush();
		newBook.setId(jpaBook.getId());
	}

	private JpaBook jpaBookFromBook(Book book) {
		final JpaBook jpaBook = new JpaBook();
		jpaBook.setName(book.getName());

		return jpaBook;
	}
}