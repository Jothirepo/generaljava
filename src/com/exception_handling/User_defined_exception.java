package com.exception_handling;



public class User_defined_exception {

	public static int age = 23;
	
	public static void age_limit() throws Exception {
		
		if (age >= 5) {
			
			System.out.println("you can create an account");
			
		} else {

			throw new NullPointerException();		//It can throw whatever the exception we define here 
													//Irrespective of what Exception should be thrown.
		}

		
	}
	
	public static void mailid(String name) throws Own_exception {
		
		 if (name.equalsIgnoreCase("jothi")) {
			
			System.out.println("mail id is correct");
			
		} else {

			throw new Own_exception("email id is wrong");	//Parameterized constructor invoked, so
														    //a parameterized constructor will be thrown
															//on own_exception
		}

	}
	
	
	
	public static void main(String[] args) throws Exception {
		
		age_limit();
		
		mailid("ram");
		
		
	}

}
