package com.collection.practical;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		Deque <String>deque=new LinkedList<>();
		
		LinkedList<Integer> linkedlist=new LinkedList<Integer>();
		linkedlist.addLast(20);
		linkedlist.addFirst(50);

		System.out.println(linkedlist);

		deque.addFirst("Second"); 
		deque.addFirst("Third");


		deque.addLast("Second to Last");

		// Removing elements from the front and back of the Deque
		System.out.println("Removed from front: " + deque.removeFirst());
		System.out.println("Removed from back: " + deque.removeLast());

		// Getting elements from the front and back of the Deque
		System.out.println("First element: " + deque.getFirst());
		System.out.println("Last element: " + deque.getLast());



		LinkedList<String>list=new LinkedList<>();
		list.addFirst("tree");
		list.addFirst("chair");
		list.addFirst("Bike");
		list.addFirst("lizard");
		list.addFirst("pen");
		list.addFirst("pencil");
		System.out.println(list);


		//traversing 


		Iterator<String> itr=list.iterator();
		System.out.println("***** ITERATOR *****");
		while(itr.hasNext()) {

			System.out.println(itr.next());
		}
	}




}
