package com.string;

public class String_and_its_methods {

	public static void main(String[] args) {
			
			String a = new String(" jyothy");
			
			System.out.println(a.charAt(2)); 				  	  //to check value by index
			System.out.println(a.indexOf("y"));					  //to check index by value & return the first one if there are multiple
			System.out.println(a.lastIndexOf("y"));				  //to check index by value & return the last  one if there are multiple
			System.out.println(a.contains("j"));			 	  //to check value's presence in given object with case sensitivity
			System.out.println(a.length());					 	  //to check the length of the characters
			System.out.println(a.equals(" jyothy")); 		 	  //to check value with cases sensitivity
			System.out.println(a.equalsIgnoreCase(" JYOTHY"));	  //to check value with cases insensitivity
			System.out.println(a.isEmpty());				 	  //to check if the object is empty
			System.out.println(a.substring(1));				 	  //to give value from given index 
			System.out.println(a.substring(2,5));				  //to give value btn starting index & ending length
			System.out.println(a.concat("_ramalingam"));		  //to add value to the existing value
			System.out.println(a.replace("y", "ee"));			  //to replace a char/value with another char/value
			System.out.println(a.toUpperCase());				  //to replace all values with uppercase
			System.out.println(a.toLowerCase());				  //to replace all values with lowercase
			System.out.println(a.startsWith(" "));				  //to check the starting value
			System.out.println(a.endsWith("y"));			 	  //to check the ending value	
			System.out.println(a.trim());					 	  //to remove the space at the beginning and end of the value
			System.out.println(String.join("/","10","02","1997"));//to join by a common delimiter
			
			String ok = "am i good enough";					 	  //to split by a common character
			String ol [] = ok.split(" ");						 
			for (String c : ol) {
				System.out.println(c);	
			}
			}
	}
