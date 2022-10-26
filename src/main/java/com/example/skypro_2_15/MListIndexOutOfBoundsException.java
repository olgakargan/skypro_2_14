package com.example.skypro_2_15;

import javax.management.RuntimeErrorException;

public class MListIndexOutOfBoundsException extends RuntimeException {
    public MListIndexOutOfBoundsException() {
    }

    public MListIndexOutOfBoundsException(String message) {
        super(message);
    }

    public MListIndexOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public MListIndexOutOfBoundsException(Throwable cause) {
        super(cause);
    }

    public MListIndexOutOfBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
