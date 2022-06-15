package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {

		Set<Object> o = new HashSet<Object>();

		HashSet<Object> a = new HashSet<Object>();

		o.add("jo");
		o.add(23);
		o.add(23.5f);
		o.add("jo");

		System.out.println(o);
		
		System.out.println("***************************************");

		a.add("ram");
		a.add(455);
		a.addAll(o);

		System.out.println(a);
		
		System.out.println("***************************************");

		System.out.println(a.contains("jo"));
		System.out.println(a.containsAll(o));
		
		System.out.println("************using for iterator******************");

		for (Object c : a) {

			System.out.println(c);

		}
		
		
		System.out.println("************using while iterator******************");
		
		Set<Object> mu = new HashSet<Object>();
		
		mu.add("kd");
		mu.add(141);
		mu.add(242.424f);
		mu.add("fs");
		
		Iterator <Object> it = mu.iterator();
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
			
			System.out.println(object);
			
		}
	}

}
