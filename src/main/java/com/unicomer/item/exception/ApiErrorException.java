package com.unicomer.item.exception;

public class ApiErrorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ApiErrorException(Exception e) {
		super(e);

	}
}
