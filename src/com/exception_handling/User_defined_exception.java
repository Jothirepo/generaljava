package com.exception_handling;



public class User_defined_exception {

	public static void age_limit(int age) throws Exception {
		
		if (age >= 5) {
			
			System.out.println("you can create an account");
			
		} else {

			throw new Exception();
		}

		
	}
	
	public static void mailid(String name) throws Own_exception {
		
		 if (name.equalsIgnoreCase("jothi")) {
			
			System.out.println("mail id is correct");
			
		} else {

			throw new Own_exception("email id is wrong");
		}

	}
	
	public static void main(String[] args) throws Exception {
		
		age_limit(6);
		
		mailid("ram");
	}

}
