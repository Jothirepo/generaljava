package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class Tree_map {

	public static void main(String[] args) {
		
		Map <String, String> t = new TreeMap <String, String> ();
		
		t.put("Asia", "earth");
		t.put("Africa", "earth");
		t.put("America", "earth");
		
		System.out.println(t);
		
		System.out.println("******************");
		
		System.out.println(t.entrySet());
		
		t.put("TN", "CHENNAI");       				
		t.put("TN", "PANRUTI");							// for Duplicate keys latest value will override the previous one
		
		System.out.println(t);
		
		t.put(null, "chennai");
		t.put(null, "trichy");
		
		System.out.println(t);
		

	}

}
