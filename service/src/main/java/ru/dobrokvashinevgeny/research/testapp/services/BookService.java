package ru.dobrokvashinevgeny.research.testapp.services;

import ru.dobrokvashinevgeny.research.testapp.domain.model.Book;

import java.util.List;

/**
 * Класс BookService
 */
public interface BookService {
	List<Book> getBookList();

	long addNewBookWithName(String bookName) throws BookServiceException;
}