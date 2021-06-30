package com.acwilliammsn.course.resources.exception;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.acwilliammsn.course.services.exceptions.DatabaseException;
import com.acwilliammsn.course.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

		@ExceptionHandler(ResourceNotFoundException.class)
		public ResponseEntity<StandardError> database(ResourceNotFoundException e, HttpServletRequest request){
			String error = "Resource not found";
			HttpStatus status = HttpStatus.BAD_REQUEST;
			StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
			return ResponseEntity.status(status).body(err);
		}
		@ExceptionHandler(DatabaseException.class)
		public ResponseEntity<StandardError> ResourceNotFound(DatabaseException e, HttpServletRequest request){
			String error = "Database error";
			HttpStatus status = HttpStatus.NOT_FOUND;
			StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
			return ResponseEntity.status(status).body(err);
		}
}
