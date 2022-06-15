package com.string;

public class String_buffer_and_its_methods {

	public static void main(String[] args) {
		
		System.out.println("difference between string & string buffer");
		System.out.println("*********************************************************");
		
		String jo = new String ("rama");
		System.out.println("original_value : " + jo);
		System.out.println("concatenating a value : " + jo.concat("_joth"));
		System.out.println("original_value_never_changed : " + jo);           						//immutable object
		
		System.out.println("*********************************************************");
	
		StringBuffer jo1 = new StringBuffer ("rama");
		System.out.println("original_value : " + jo1);
		System.out.println("appending a value : " + jo1.append("_joth"));
		System.out.println("original_value_modified : " + jo1);										//mutable object
		
		System.out.println("*********************************************************");
		
		System.out.println("stringbuffer and it's methods are as follows");
		System.out.println("reversing values using reverse : " + jo1.reverse()); 															// to reverse an object of stringbuffer
		StringBuffer a = new  StringBuffer("jothi");
		System.out.println("replacing values using start index value & end length value : " + a.replace(0, 2, "ila")); // to replace values in an object of stringbuffer
		StringBuffer b = new  StringBuffer("jothi");
		System.out.println("removing values using start index value & end length value : " + b.delete(0, 2)); // to delete values in an object of stringbuffer
		StringBuffer c = new  StringBuffer("jothi");
		System.out.println("inserting value using index value : " + c.insert(1, "y")); // to insert value in an object of stringbuffer using index value
		
		System.out.println("*********************************************************");
		
		System.out.println("charAt, substring & length methods are applicable for stringbuffer as well");
		
	}

}
