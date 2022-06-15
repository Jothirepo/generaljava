package com.upcasting;

public class Child_class extends Parent_class {

	@Override
	public void amazon () {
		super.amazon();
		System.out.println("amazon transformed customer's way of life");
	}
	
//	private void apple() {
//		
//		System.out.println("this is apple");
//
//	}
	
	public static void main(String[] args) {
		
		Parent_class jo = new Child_class ();
		
		jo.amazon();
		jo.flipkart();
		//jo.apple();
		
		
//		jo     = reference name for PARENT (So we can only implement parent methods & can point child/sub-classes of parents not the child/sub-class mentioned in the objection creation syntax)
//		parent = calling class
//		child  = object created for child
//
//		! accessing child class object in parent class 
//		! only parent class methods can be called in upcasting
//		! Method overriding is done here to upcast
//			
		
	}

}
