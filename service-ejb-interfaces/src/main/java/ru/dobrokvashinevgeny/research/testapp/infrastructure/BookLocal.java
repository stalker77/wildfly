package ru.dobrokvashinevgeny.research.testapp.infrastructure;

import ru.dobrokvashinevgeny.research.testapp.domain.model.Book;
import ru.dobrokvashinevgeny.research.testapp.services.BookServiceException;

import javax.ejb.Local;
import java.util.List;

/**
 * Класс BookLocal
 */
@Local
public interface BookLocal {
	List<Book> getBookList();

	long addNewBookWithName(String bookName) throws BookServiceException;
}