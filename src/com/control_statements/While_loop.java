package com.control_statements;

public class While_loop {

	public While_loop() {
		
		System.out.println("CONSTRUCTOR_BLOCK_WITH_WHILE_LOOP");

		int i = 7;
		while (i <= 10) {
			System.out.println("TRUE");
			i++;
			System.out.println("CONDITION MET");
		}
	}
	protected void do_while() {
		System.out.println("*************************");
		int a = 18;
		do {
			System.out.println("condition failed");
			a--;
		} while (a > 15);
		{
			System.out.println("CONDITION MET");
		}
	}
	private void if_else() {
		System.out.println("*************************");
		int x = 10;
		if (x < 5) {
			System.out.println(" x is smaller thanpredefined ");
		} else {
			System.out.println("x is greater than predefined");
		}
	}
	static {
		System.out.println("STATIC_BLOCK_WITH_NESTED_IF");
		System.out.println("let's play guess game");
		
		int b = 20;
		
		if (b < 10) {System.out.println("nope"); }
		else if (b > 20) {System.out.println("nope"); }
		else if (b >= 20) {System.out.println("yes it's 20 that's exactly what i thought"); 
			System.out.println("*************************");}
		else {System.out.println("all your guesses are wrong");}
		}
	
	public static void main(String[] args) {

		While_loop w = new While_loop();
		
		System.out.println("PROTECTED BLOCK_WITH_DO_WHILE_LOOP");
		
		w.do_while();
		
		System.out.println("PRIVATE BLOCK WITH IF ELSE LOOP");
		
		w.if_else();
	}
}
