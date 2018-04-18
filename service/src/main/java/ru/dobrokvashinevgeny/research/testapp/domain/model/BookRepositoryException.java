package ru.dobrokvashinevgeny.research.testapp.domain.model;

/**
 * Класс BookRepositoryException
 */
public class BookRepositoryException extends Exception {
	/**
	 * Создает <code>BookRepositoryException</code> с указанным
	 * детализирующим сообщением.
	 *
	 * @param message детализирующее сообщение.
	 */
	public BookRepositoryException(String message) {
		super(message);
	}

	/**
	 * Создает новое исключение с указанным детализирующим сообщением и
	 * причиной.
	 *
	 * @param message детализирующее сообщение (которое сохраняется для
	 *                дальнейшего получения через {@link Throwable#getMessage()} метод).
	 * @param cause   причина (которое сохраняется для дальнейшего
	 *                получения через {@link Throwable#getCause()} method).
	 *                (Значение <tt>null</tt> является разрешенным, и означает
	 *                что причина несуществует или неизвестна.)
	 */
	public BookRepositoryException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Создает новое исключение с причиной.
	 *
	 * @param cause причина (которое сохраняется для дальнейшего
	 *              получения через {@link Throwable#getCause()} method).
	 *              (Значение <tt>null</tt> является разрешенным, и означает
	 *              что причина несуществует или неизвестна.)
	 */
	public BookRepositoryException(Throwable cause) {
		super(cause);
	}
}