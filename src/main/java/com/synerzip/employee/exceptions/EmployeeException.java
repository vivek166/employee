package com.synerzip.employee.exceptions;

import java.io.Serializable;

public class EmployeeException extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;
	public EmployeeException() {
		super();
	}
	public EmployeeException(String msg) {
		super(msg);
	}

	
}
