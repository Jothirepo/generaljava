package com.Pojo;

public class Pojo_b {			//accessing pojo_a class without extends & static

	public static void main(String[] args) {
		
		Pojo_a A = new Pojo_a();
		
		//get current value
		
		int getyear = A.getYear();
		System.out.println(getyear);
		
		
		//set value 1st time by passing as an input/parameter
		
		A.setYear(30);
		
		int getset = A.getYear();
		
		System.out.println(getset);
		
		
		
		//set value 2nd time
		
		A.setYear(40);
		
		int getset2 = A.getYear();
	
		System.out.println(getset2);
	}

}
