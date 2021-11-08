package com.example.engines.exceptions;

public class FuelTypeException extends RuntimeException {

	public FuelTypeException() {
		super();
	}

	public FuelTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FuelTypeException(String message, Throwable cause) {
		super(message, cause);
	}

	public FuelTypeException(String message) {
		super(message);
	}

	public FuelTypeException(Throwable cause) {
		super(cause);
	}
}
