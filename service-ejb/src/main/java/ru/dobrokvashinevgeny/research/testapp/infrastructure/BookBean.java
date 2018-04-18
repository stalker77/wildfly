/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.testapp.infrastructure;

import ru.dobrokvashinevgeny.research.testapp.domain.model.Book;
import ru.dobrokvashinevgeny.research.testapp.services.*;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Класс BookBean
 */
@Stateless
public class BookBean implements BookLocal {
	@Inject
	private ServiceRegistry serviceRegistry;

	@Override
	public List<Book> getBookList() {
		BookService bookService = serviceRegistry.bookService();

		return bookService.getBookList();
	}

	@Override
	public long addNewBookWithName(String bookName) throws BookServiceException {
		BookService bookService = serviceRegistry.bookService();

		return bookService.addNewBookWithName(bookName);
	}
}