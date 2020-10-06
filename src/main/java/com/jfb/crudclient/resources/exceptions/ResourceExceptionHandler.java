package com.jfb.crudclient.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import com.jfb.crudclient.services.exceptions.DatabaseException;
import com.jfb.crudclient.services.exceptions.ResourceNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException e, HttpServletRequest request){
        StandardError err = new StandardError();
        HttpStatus status = HttpStatus.NOT_FOUND;
            err.setTimesStamp(Instant.now());
            err.setStatus(status.value());
            err.setError("Resource not found");
            err.setMessage(e.getMessage());
            err.setPath(request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request) {
        StandardError err = new StandardError();
        HttpStatus status = HttpStatus.BAD_REQUEST;
            err.setTimesStamp(Instant.now());
            err.setStatus(status.value());
            err.setError("Database exception");
            err.setMessage(e.getMessage());
            err.setPath(request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

}
