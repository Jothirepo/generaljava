package com.collection;

import java.util.LinkedList;

public class Linkedlist_methods {

	public static void main(String[] args) {
		
		LinkedList <Object> l = new LinkedList <Object> ();
		
		l.add(23);
		l.add("jo");
		l.add(23.4f);
		l.addFirst("yes");
		l.add("benz");
		l.add("bmw");
		l.add("benz");
		l.add("bugatti");
		l.add("ford");
		l.add("maruti");
		l.add("ford");
		l.add("kia");
		l.addLast("ok");
		
		System.out.println(l);
		
		l.getFirst();
		l.get(0);
		l.getLast();
		
		l.remove(1);
		l.removeFirst();
		l.removeLast();
		
		l.poll();
		l.pollLast();
		
		System.out.println(l);
		
		l.removeFirstOccurrence("benz");
		l.removeLastOccurrence("ford");
		
		System.out.println(l);

	}

}
