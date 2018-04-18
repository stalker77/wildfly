package ru.dobrokvashinevgeny.research.testapp.domain.model;

import java.util.List;

/**
 * Класс BookRepository
 */
public interface BookRepository {
	List<Book> allBooks();

	void save(Book newBook) throws BookRepositoryException;
}