package com.overriding;

public class Overriding_data2 extends Overriding_data {
	
	@Override
	public void jothi () {
		
		System.out.println("hi my name is jothi ending with i");

	}

	public static void main(String[] args) {
		Overriding_data e = new Overriding_data2() ;
		e.jothi();
		e.ramalingam();
		
	}
}
