package com.exception_handling;

public class Exceptions {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 0;
		
		try {
			int c = (a/b);
			System.out.println(c);  //since exception occurred, this print statement is not executed, it jumps to catch block
			
		} catch (Exception e) {
			System.out.println("anything divided by zero is infinity, so this is an exception which is handled by try-catch block");
		}
		
		finally {
			System.out.println("finally block gets executed irrespective of o.p is an exception/error or not");
		}
	}

}
