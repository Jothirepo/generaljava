package com.control_statements;

public class For_loop {

	static {

		System.out.println("LOOP TILL 'A' BECOMES LESS THAN OR EQUAL TO 20");
	}
	public For_loop() {

		System.out.println("condition pass");

	}
	{
		for (int a = 5; a <= 20; a++) {

			System.out.println(a);	
		}
	}
	public static void main(String[] args) throws Throwable {

		For_loop e = new For_loop();
		e.finalize();
	}
}
