/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.testapp.infrastructure;

import ru.dobrokvashinevgeny.research.testapp.domain.model.BookRepository;
import ru.dobrokvashinevgeny.research.testapp.services.*;

import javax.inject.Inject;

/**
 * Класс CdiServiceRegistry
 */
public class CdiServiceRegistry implements ServiceRegistry {
	@Inject
	private BookRepository bookRepository;

	@Override
	public BookService bookService() {
		return new RealBookService(bookRepository);
	}
}