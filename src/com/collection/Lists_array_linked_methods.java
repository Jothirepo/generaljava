package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lists_array_linked_methods {

	public static void main(String[] args) {
		
		List <String> a = new ArrayList <String> (); 	//SYNTAX with generics (for similar datatype)
		List <Object> o = new LinkedList <Object> ();	//SYNTAX with object (for dissimilar datatype)
		List ak = new LinkedList ();					//SYNTAX without generics (for dissimilar datatype) | not recommended |
		
		ak.add("plant");
		ak.add(23);
		
		System.out.println(ak);
		
		o.add("benz");
		o.add("bmw");
		o.add(23);
		
		
		System.out.println(o);
		
		System.out.println("***********************************************");
		
		a.add("jothi");					// to add an element in an arraylist
		a.add("rama");
		a.add("lingam");
		a.add("rama");
		
		System.out.println(a);
		
		System.out.println("***********************************************");
		
		o.addAll(a);					// to add one list to another list
		
		System.out.println(o);
		
		System.out.println("**********************************");
		
		o.retainAll(a);
		
		System.out.println(o);    		// to retain the values of one list within another list
		
		System.out.println("*************************************");
		
		System.out.println(a.get(2));					// to get an element in an arraylist using index value
 		
		System.out.println(a.indexOf("rama")); 			//to get index value of an element
		System.out.println(a.lastIndexOf("rama"));		//to get last index value of an element
		
		List <String> b = new ArrayList <String> ();
		
		System.out.println(b.addAll(a));				// to add all the elements in one list to another list
		
		b.clear();
		
		System.out.println(b);
		
		a.remove(3);									// to remove an element from a list based on index value
		a.remove("lingam");								// to remove an element from a list based on value
		a.add("lingam");
		a.add("rama");
		a.add(null);									// to add a null element to a list
		a.set(0, "jo");
		
		System.out.println(a);
		System.out.println("is the list empty  : " +a.isEmpty());				// to check whether a list is empty or not
		System.out.println("does the list have rama : " +a.contains("rama"));	  		// to check whether the value is present in a list
		System.out.println("size of the list : " + a.size());         			// to check the size of the given list
		
		System.out.println("********iterator based on for loop*********");
		
		for (int i = 0; i < a.size(); i++) {			// to get value based on for loop
			
			System.out.println(a.get(i));
			
		}
		
		System.out.println("*********iterator based on for each**********");
		
		for (String f : a) {							// to get value based on for each 
			
			System.out.println(f);
			
		}
		
		System.out.println(a.size());
		
		System.out.println("*********forward traversing based on list iterator using while**********");
		
		ListIterator <String> c = a.listIterator();		
		
		while (c.hasNext()) {
			
			System.out.println(c.next());
			
		}
		
		System.out.println("*********reverse traversing based on list iterator using while**********");
		
		while(c.hasPrevious()) {
			
			System.out.println(c.previous());
			
		}
		
		System.out.println("***************************************************************************");
		
		Iterator<String> d = b.iterator();
		
		while(d.hasNext()) {
			
			System.out.println(d.hasNext());
		}
		
	}

}
