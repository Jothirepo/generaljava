package com.Constructor_overloading_this;

public class Overloading_constructor_this {

	public Overloading_constructor_this (long number) {

		System.out.println(number);
	}

	public Overloading_constructor_this (String name) {

		this(234l);

		System.out.println(name);
	}

	public Overloading_constructor_this (int year) {

		this("amazon");

		System.out.println(year);
	
	}
	

	public static void main(String[] args) throws Throwable {
		Overloading_constructor_this e = new Overloading_constructor_this (1997);
		e.finalize();
	}
}
