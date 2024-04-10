package com.bookstoreapp.exception;

import com.bookstoreapp.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import javax.validation.ValidationException;

@RestControllerAdvice
public class BookstoreErrorHandler {

    private String getRequestUri(WebRequest request) {
        if (request instanceof ServletWebRequest) {
            return ((ServletWebRequest) request).getRequest().getRequestURI();
        }
        return "";
    }

    /* DONE:
    create a method to handle BookNotFoundException
    Return a ResponseEntity of ErrorResponse
    Return a status of 404
     */
    @ExceptionHandler(value = BookNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleBookNotFoundException(BookNotFoundException ex, WebRequest request) {
        // DONE: Implement this method
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(httpStatus.value());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());
        errorResponse.setPath(getRequestUri(request));
        errorResponse.setError("Resource Not found");

        return new ResponseEntity<>(errorResponse, httpStatus);

    }

    // create a method to handle BookAlreadyExistsException

    /* TODO:
    create a method to handle BookAlreadyExistsException
    Return a ResponseEntity of ErrorResponse
    Return a status of 409
     */
    @ExceptionHandler(value = BookAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleBookAlreadyExistsException(BookAlreadyExistsException ex, WebRequest request) {
        // TODO: Implement this method
        HttpStatus httpStatus = HttpStatus.CONFLICT;
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(httpStatus.value());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());
        errorResponse.setPath(getRequestUri(request));
        errorResponse.setError(ex.getMessage());

        return new ResponseEntity<>(errorResponse, httpStatus);

    }

    /* TODO:
    create a method to handle ValidationException
    Return a ResponseEntity of ErrorResponse
    Return a status of 400
     */
    @ExceptionHandler(value = ValidationException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(ValidationException ex, WebRequest request) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(httpStatus.value());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());
        errorResponse.setPath(getRequestUri(request));
        errorResponse.setError("Validation failed");

        return new ResponseEntity<>(errorResponse, httpStatus);

    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, WebRequest request) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(httpStatus.value());
        errorResponse.setMessage(ex.getAllErrors().toString());
        errorResponse.setTimestamp(System.currentTimeMillis());
        errorResponse.setPath(getRequestUri(request));
        errorResponse.setError("Method Arguments Not Valid");

        return new ResponseEntity<>(errorResponse, httpStatus);

    }


    /* TODO:
    create a method to handle Exception
    Return a ResponseEntity of ErrorResponse
    Return a status of 500
     */
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception ex, WebRequest request) {
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(httpStatus.value());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());
        errorResponse.setPath(getRequestUri(request));
        errorResponse.setError(ex.getMessage());

        return new ResponseEntity<>(errorResponse, httpStatus);

    }



}
