package com.cg.exception;

public class ErrorInfo {
	
	private String message;
	
	public ErrorInfo() {
		
	}
	
	public ErrorInfo(String nsg) {
		super();
		this.message=nsg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
