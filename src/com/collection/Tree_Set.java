package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		
		TreeSet <Integer> T = new TreeSet <Integer> ();
		
		T.add(1);
		T.add(23);
		T.add(10);
		T.add(25);
		T.add(352);
		
		System.out.println(T);
		
		System.out.println(T.first());
		System.out.println(T.last());

		System.out.println("*************headset***************");
		
		System.out.println(T.headSet(352));					// To get the values which are lesser than given value within the set
		
		System.out.println("************tailset*****************");
		
		System.out.println(T.tailSet(23));					// To get the value which was given & higher than that
		
		System.out.println("***********subset******************");
		
		System.out.println(T.subSet(23, 352)); 				// To get values within the given range starting from value given & ending before the given value

		System.out.println(T.comparator());					// Will return null if the sorting is done in default natural order
		
		System.out.println("*************Higher & lower******************");
		
		System.out.println(T.higher(10));					// to get the immediate higher value of given value
		System.out.println(T.lower(10));					// to get the immediate lower value of given value

		System.out.println("**************poll first & last*****************");
		
		System.out.println(T.pollFirst());					// To get & delete the first value in the treeset
		System.out.println(T.pollLast());					// To get & delete the last value in the treeset
		 
		System.out.println("After polling : " + T);      	// after polling 
		
		System.out.println("**********Descending set***************");
		
		System.out.println(T.descendingSet()); 				// To get the tree set in descending order
		
		System.out.println("**********Ascending iterator***************");
		
		Iterator <Integer> i = T.iterator();
		
		while (i.hasNext()) {
			
			System.out.println(i.next());
			
		}
		
		System.out.println("**********Descending iterator***************");
		
		Iterator <Integer> f = T.descendingIterator();
		
		while (f.hasNext()) {
			
			System.out.println(f.next());
			
		}
		
		System.out.println("******homogeneous & comparable datatypes are only allowed in treeset*****");
		TreeSet x = new TreeSet ();
		
		x.add("j");
		x.add("a");
		
		System.out.println(x);
		
		System.out.println("***heterogeneous & uncomparable datatypes will throw CLASS CAST EXCEPTION");
		TreeSet l = new TreeSet ();
		
		l.add("j");
		l.add(2);
		
		System.out.println(l);
		
	}

}
