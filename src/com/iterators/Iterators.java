package com.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Iterators {

	public static void main(String[] args) {
		
		List<Object> li = new ArrayList<Object>();
		
		li.add(10);
		li.add(40);
		li.add(0, 5);
		
		//System.out.println(li);
		
		Iterator<Object> iterator = li.iterator();
		
		while (iterator.hasNext()) {
			
			Object object = (Object) iterator.next();
			
			System.out.println(object);
			
		}
		
	}

}
