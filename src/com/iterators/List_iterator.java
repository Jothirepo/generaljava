package com.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_iterator {

	public static void demolist() {

		List<Object> li = new ArrayList<Object>();
		li.add(10);
		li.add(50);
		li.add(20);
		li.add(30);

		ListIterator<Object> listIterator = li.listIterator();

		while (listIterator.hasNext()) {
			
			Object forward = (Object) listIterator.next();
			System.out.println("forward traverse : " + forward);

		}
		
		while (listIterator.hasPrevious()) {

			Object previous = listIterator.previous();
			System.out.println("backward traverse : " + previous);
			
		}

	}

	public static void main(String[] args) {

		demolist();
	}

}
