package com.devsuperior.dscatalog.exceptions;

public class DatabaseExceptionHandler extends RuntimeException {
 
	private static final long serialVersionUID = 1L;
	
	public DatabaseExceptionHandler(String msg) {
		super(msg);
	}
	
}
