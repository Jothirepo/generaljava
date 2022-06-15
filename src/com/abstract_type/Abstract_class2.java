package com.abstract_type;

public class Abstract_class2 extends Abstract_class {
	
	@Override
	public void ramalingam () {
		System.out.println("my last name is ramalingam");
	}
	
	public void jk() {			// we can only implement parent methods & can point subclasses of parents not the child class mentioned in the objection creation syntax)
		
		System.out.println("this is testing");

	}
	
	public static void main(String[] args) {
		
		Abstract_class ac = new Abstract_class2();
		
	    //parent_class ref = new child class ();	
		
		ac.ramalingam();
	
	}

}

