package com.exception_handling;

public class Own_exception extends Exception {

	public Own_exception(String email) {
		
		System.out.println("error message : " + email);
	}

}
