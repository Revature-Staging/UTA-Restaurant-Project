package com.revature.EmployeeManager.Controller;

import java.sql.SQLException;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class SQLExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ConstraintViolationException.class)
	public final ResponseEntity<ErrorMessage> sqlExceptionHandler(ConstraintViolationException sqlException) {
		ErrorMessage exceptionResponse = new ErrorMessage(sqlException.getMessage(), "Something went wrong.");
		return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
}

class ErrorMessage {
	private String exceptionMessage;
	private String customMessage;

	public ErrorMessage(String exceptionMessage, String customMessage) {
		super();
		this.exceptionMessage = exceptionMessage;
		this.customMessage = customMessage;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public String getCustomMessage() {
		return customMessage;
	}

	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}

	public ErrorMessage() {
		super();
	}
}