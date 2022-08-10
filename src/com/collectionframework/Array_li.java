package com.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Array_li {

	public static void main(String[] args) {
		
		List<Object> li = new ArrayList<Object> ();
		
		li.add("jothi");
		li.add(23);
		li.add("ram");
		li.add(2.5f);
		li.add("ram");
		li.add(1, 26);
		li.add(1, "Rocky");
		li.add("jakku");
		li.add("ram");
		
		System.out.println("ArrayList is been created with duplicates, integer, string, float, object with same index position : " + li);
		System.out.println("***************************************************");
	
	
		int length = li.size();
		System.out.println("length of the list is " + length);
		int index = length - 1;
		System.out.println("index of the list is " + index);
		
		System.out.println("***************************************************");
		
		
		int indexOf = li.indexOf(2.5f);
		System.out.println("index of 2.5f is " + indexOf);
		System.out.println("***************************************************");
		
		
		int indexOf2 = li.indexOf("ram");
		System.out.println("index of ram on first occurrence is " + indexOf2);
		int lastIndexOf = li.lastIndexOf("ram");
		System.out.println("index of ram on last occurrence is " + lastIndexOf);
		
		System.out.println("***************************************************");
		
		
		Object object = li.get(3);
		System.out.println("value at the index position 3 is " + object);
		System.out.println("***************************************************");
		
		boolean contains = li.contains(23);
		System.out.println("whether the list contains 23 is " + contains);
		System.out.println("***************************************************");

		int indexOf3 = li.indexOf(230);
		System.out.println("Index of value 230 is " + indexOf3 + ", as 230 doesn't exist. Also no exception will be thrown");
		System.out.println("***************************************************");

		try {
			
			Object object2 = li.get(10);
			
			System.out.println(object2);
			
			
		} catch (IndexOutOfBoundsException e) {
			
			System.out.println("IndexOutOfBoundException has been sorted out with try-catch block");
		}
		
		finally {
			
			System.out.println("***************************************************");
			
			String s = "ilakiya";

			int indexO = s.indexOf("i", 2);
			int indexOf4 = s.indexOf("a", 3);
			boolean contains2 = s.contains("K");
			
			System.out.println("whether the list contains K is " + contains2);
			System.out.println("index of 'i' in string ilakiya from index 2 is " + indexO);
			System.out.println("index of 'a' in string ilakiya from index 3 is " + indexOf4);
		
			System.out.println("***************************************************");

			char charAt = s.charAt(20);
			System.out.println(charAt);
		}
		
		
	}

}
