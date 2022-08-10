package com.exception_handling;

public class Parent_child_exception {

	public static void main(String[] args) {

		int a = 0;
		int b = 10;

		try {
			
			int c = (b / a);
		}

//		catch (Exception e) {
//
//			System.out.println("Valid exception didn't handled by before catch blocks so parent (Exception) used here");
//		}
//		
//		catch (IndexOutOfBoundsException e) {
//
//			System.out.println("IndexOutOfBoundsException occured here");
//		}
//		
		catch (ArithmeticException e) {

			System.out.println("arithmetic exception occured here");
		}

		

	}

}
