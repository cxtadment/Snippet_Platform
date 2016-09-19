package com.xiaoting.common.persistence.exception;

public class MyEntityNotFoundException extends RuntimeException {

    public MyEntityNotFoundException() {

    }

    public MyEntityNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public MyEntityNotFoundException(final String message) {
        super(message);
    }

    public MyEntityNotFoundException(final Throwable cause) {
        super(cause);
    }

}
