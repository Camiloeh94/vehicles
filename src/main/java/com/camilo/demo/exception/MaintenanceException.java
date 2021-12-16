package com.camilo.demo.exception;

import org.springframework.http.HttpStatus;

public class MaintenanceException extends RuntimeException {

    private static final long serialVersionUID = 7892566322356545871L;
    private final HttpStatus httpStatus;
    private final String message;

    public MaintenanceException(String message) {
        this.message = message;
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public MaintenanceException(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public MaintenanceException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public MaintenanceException(String message, Throwable cause, HttpStatus httpStatus) {
        super(message, cause);
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }
}