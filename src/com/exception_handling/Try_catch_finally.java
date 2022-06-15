package com.exception_handling;

public class Try_catch_finally {

	public static void main(String[] args) {
		
		try {										//non-parameterized
			
			System.out.println(10/0);
			
		} catch (NullPointerException e) {			//catch block must always be parameterized
			
			System.out.println("this is nullpointer exception");
		}
		
		catch (ArithmeticException e) {				//we can overload multiple catch blocks
			
			System.out.println("this is arithmetic exception");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("this is arrayindexoutofbound exception");
		}
		
		
		//exception will be thrown if even multiple catch blocks didn't handle the exception from try block
		 
		
		finally {
			
			System.out.println("this is finally block which is run before system.exit(0);");
			
			System.exit(0);
			
			System.out.println("this is after system.exit");
		}
	}

}
