package com.benspring;

public class HelloWorld {
	private String message;

	public String getMessage() {
		System.out.println("Ben Message: " + message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
