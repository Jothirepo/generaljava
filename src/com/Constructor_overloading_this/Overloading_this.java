package com.Constructor_overloading_this;

public class Overloading_this {

	public void Rocky (long number) {

		System.out.println(number);
	}
	
	public void Rocky (String name) {
		
		this.Rocky(19978l);
		
			System.out.println(name);
		}

	public void Rocky (int version) {
		
		this.Rocky("jothi");

			System.out.println(version);
		}

	public static void main (String[] args) {

		Overloading_this e = new Overloading_this ();
		
		e.Rocky(22);
	
	}
}