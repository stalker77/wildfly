/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.testapp.infrastructure.resources;

import javax.ws.rs.core.*;
import javax.ws.rs.ext.*;

/**
 * Класс ExceptionHandler
 */
@Provider
public class ExceptionHandler implements ExceptionMapper<Exception> {
	@Override
	public Response toResponse(Exception e) {
		return Response
			.status(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode())
			.entity(e.getMessage())
			.type(MediaType.APPLICATION_JSON)
			.build();
	}
}