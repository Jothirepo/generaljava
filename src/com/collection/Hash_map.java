package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hash_map {

	public static void main(String[] args) {
		
		HashMap <Integer, String> emp = new HashMap <Integer, String> ();
		
		emp.put(1, "jothi");
		emp.put(2, "ramalingam");
		emp.put(3, "s");								 // To add (entry : key & value stored) elements to a map
		
		System.out.println(emp);
		
		Map <Integer, String> emp1 = new HashMap <Integer, String> ();
		
		emp1.put(4, "benz");	
		emp1.putAll(emp);								 // To add elements from one map to another
		
		System.out.println(emp1);
 
		System.out.println(emp1.containsKey(3));		 // To check whether a value is present on a key
		
		System.out.println(emp1.containsValue("jothi")); // To check key based on value
		
		System.out.println("cloned map : "+ emp.clone());// To clone/copy all values to a new map
	
		System.out.println(emp1.keySet());   			 // To get all the keys in the map
		
		System.out.println(emp1.values());				 // To get all the values in the map
		
		System.out.println(emp1.get(3));				 // To get a value based on a key
		
		System.out.println(emp1.entrySet()); 			 // To get all the keys & their respective values
	
		Map <String, String> emp2 = new HashMap <String, String> ();
		
		System.out.println("*****insertion order not maintained for HashMap*****");
		
		emp2.put("car", "bugatti");
		emp2.put("bike", "honda");
		emp2.put("cycle", "hercules");
		
		System.out.println(emp2);
		
		Map <String, String> emp3 = new LinkedHashMap <String, String> ();
		
		System.out.println("*****insertion order maintained for LinkedHashMap*****");
		
		emp3.put("car", "bmw");
		emp3.put("bike", "yamaha");
		emp3.put("cycle", "hero");
		
		System.out.println(emp3);
		
		
		
	}

}
