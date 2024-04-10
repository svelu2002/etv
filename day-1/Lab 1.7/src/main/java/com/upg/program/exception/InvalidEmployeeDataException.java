package com.upg.program.exception;

public class InvalidEmployeeDataException extends IllegalArgumentException {
    public InvalidEmployeeDataException(String message) {
        super(message);
    }
}
