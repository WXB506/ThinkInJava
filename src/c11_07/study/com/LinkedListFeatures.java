package c11_07.study.com;

import java.util.*;

public class LinkedListFeatures {
	public static void main(String[] args) {
		LinkedList<Integer> intlist = new LinkedList<Integer>();
		for(int i=0; i<10; i++)
			intlist.add(i);
		System.out.println(intlist);
		// identical
		System.out.println(intlist.getFirst());
		System.out.println(intlist.element());
		
		// only differs in empty-list behavior
		System.out.println(intlist.peek());
		
		// identical
		System.out.println(intlist.removeFirst());
		System.out.println(intlist.remove());
		
		// only differs in empty-list behavior
		System.out.println(intlist.poll());
		
		System.out.println(intlist);
		
		intlist.addFirst(2);
		System.out.println(intlist);
		
		// add at end
		intlist.offer(1);
		System.out.println(intlist);
		intlist.add(0);
		System.out.println(intlist);
		intlist.addLast(0);
		System.out.println(intlist);
		
		intlist.removeLast();
		System.out.println(intlist);
	}
}
