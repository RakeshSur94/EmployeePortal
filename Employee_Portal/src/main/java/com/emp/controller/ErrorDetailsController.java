package com.emp.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.emp.error.ErrorDetials;
import com.emp.exception.NotFoundException;

@ControllerAdvice
public class ErrorDetailsController {
	
	@ExceptionHandler(NotFoundException.class)
	public String companyNotFoundException(NotFoundException nfe) {
		ErrorDetials details=new ErrorDetials(LocalDateTime.now(),nfe.getMessage(),"404- Request Resource NotFounds");
		return "Error is "+details;
	}
	@ExceptionHandler(Exception.class)
	public String allException(Exception e) {
		ErrorDetials details=new ErrorDetials(LocalDateTime.now(),e.getMessage()," Problem In Execution");
		return "Error is "+details;
	}
	

}
