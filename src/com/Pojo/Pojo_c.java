package com.Pojo;

public class Pojo_c {			//accessing pojo_a class without extends & static


	public static void main(String[] args) {
		
		Pojo_a  n = new Pojo_a ();
		
		int get = n.getYear();

		System.out.println(get);
		
		
		
		n.setYear(55);
		
		int set = n.getYear();
		
		System.out.println(set);
	}

}
