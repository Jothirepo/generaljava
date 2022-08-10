package com.oops_concepts;

public class Array_list implements List_demo {		//Single Inheritance done here
	
	//while implementing List (Interface), it will prompt us to override Interface methods)

	
	public void jot() {
		
		//childclass method

	}

	@Override		//Polymorphism done here
	public void add() {
		
		System.out.println("encapsulation & polymorphism (overriding) happens here");
		//Method overrided from Interface
		//since data from child class & code from interface has been binded together is called encapsulation
	}

	public static void main(String[] args) {
		
		List_demo upcast = new Array_list();
	//(Interface) refnam = new (Childclass)
		
		upcast.add();		//only parent method can be called in upcasting/overriding
		
		//upcast.jot		child class methods couldn't be called here
		
		//Accessing child class object in parent class
	}
}
