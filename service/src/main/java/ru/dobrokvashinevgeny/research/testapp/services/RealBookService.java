/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.testapp.services;

import ru.dobrokvashinevgeny.research.testapp.domain.model.*;

import java.util.List;

/**
 * Класс RealBookService
 */

public class RealBookService implements BookService {
	private final BookRepository bookRepository;

	public RealBookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public List<Book> getBookList() {
		return bookRepository.allBooks();
	}

	@Override
	public long addNewBookWithName(String bookName) throws BookServiceException {
		Book newBook = new Book(bookName);

		try {
			bookRepository.save(newBook);
		} catch (BookRepositoryException e) {
			throw new BookServiceException(e);
		}

		return newBook.getId();
	}
}