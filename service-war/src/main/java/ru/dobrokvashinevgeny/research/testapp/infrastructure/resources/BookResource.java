/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.testapp.infrastructure.resources;

import ru.dobrokvashinevgeny.research.testapp.domain.model.Book;
import ru.dobrokvashinevgeny.research.testapp.infrastructure.BookLocal;
import ru.dobrokvashinevgeny.research.testapp.services.BookServiceException;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Класс BookResource
 */
@Path("/books")
public class BookResource {
	@EJB
	private BookLocal bookBean;

	@GET
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8;")
	public List<Book> getBookList() {
		return bookBean.getBookList();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8;")
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8;")
	public long addBook(String bookName) throws BookServiceException {
		return bookBean.addNewBookWithName(bookName);
	}
}