package com.exception_handling;

public class Try_catch_finally {

	public static void main(String[] args) {
		
		//Child---different_child---different_child exceptions order
		
		try {										//non-parameterized
			
			System.out.println(10/0);
			
		} catch (NullPointerException e) {			//catch block must always be parameterized
					//Child class of exception
			
			System.out.println("this is nullpointer exception");
		}
		
		catch (ArithmeticException e) {				//we can overload multiple catch blocks
					//Different Child class of exception
			
			System.out.println("this is arithmetic exception and it occured in the 2nd instance of catch, since first is not a relevant exception");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
					//Different Child class of exception
			
			System.out.println("this is arrayindexoutofbound exception");
		}
		
		
		//exception will be thrown even if multiple catch blocks didn't handle the exception from try block
		 
		
		finally {
			
			System.out.println("*****************************************************************************");
			System.out.println("this is finally block which runs uninterrupted and before system.exit(0); has been executed");
			
			System.exit(0);
			
			System.out.println("this is after system.exit");
		}
	}

}
