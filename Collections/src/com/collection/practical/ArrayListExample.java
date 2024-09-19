package com.collection.practical;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {



		List<String> list=new ArrayList<>(); //creating a arraylist
		list.add("Alexander");   //adding values 
		list.add("Benjamin");
		list.add("Noah");
		list.add("Liam");
		list.add("James");
		System.out.println(list);

		//Looping

		//using iterator interface

		

		System.out.println("**** USING ITERATOR INTERFACE *****");
		Iterator<String> it=list.iterator();

		while(it.hasNext()) //checks if the iterator has a value 
		{
			System.out.println(it.next()); // print the value and moves to next value
		}


		//using enhanced for loop

		System.out.println("***** USING ENHANCED FOR LOOP *****");
		for(String name: list) {
			System.out.println(name);
		}

		System.out.println("***** ADDALL METHOD *****");
		//common methods 
		//addAll method

		List<Integer> l = new ArrayList<>(); 
		l.add(10); 
		l.add(15); 
		l.add(20); 
		System.out.println(l); 

		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		arr.add(100); 
		arr.add(200); 
		arr.add(300); 
		arr.add(1); 
		arr.add(2); 
		arr.add(4); 
		arr.add(6); 
		arr.add(5); 
		arr.add(2); 
		arr.add(6); 
		arr.add(1); 
		arr.add(6); 
		arr.add(4);
		System.out.println(arr); 

		l.addAll(arr); //addAll method to add the values to the arraylist l

		System.out.println(l); 


		//remove method

		System.out.println("***** REMOVE METHOD *****");

		System.out.println("Removed item: "+list.remove(0));

		boolean remove=list.remove("James");
		
		System.out.println("Removed item available: "+remove);

		System.out.println(list.contains("Alexander"));



		//searching and indexing 


		boolean present=list.contains("Liam");
		System.out.println("Checks if the item is present in the list: "+present);

		System.out.println(arr);

		System.out.println("This is indexOf method "+arr.indexOf(2));




		//removing the values 


		List <Integer> ls=new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(1);
		ls.add(5);
		ls.add(4);
		ls.add(4);
		ls.add(1);
		ls.add(3);


		ls.clear();
		System.out.println(ls);	





		//ArrayList<String> myList= new ArrayList<String>();

//		myList.add("String");
		//		myList.add(20);
		//		myList.add(2.44444);
		//		myList.add(true);


//		System.out.println(myList.getFirst().contains("r"));

		//		System.out.println(myList);
		//		
		//		String value= (String) myList.getFirst();
		//		System.out.println(value);












	}
}
