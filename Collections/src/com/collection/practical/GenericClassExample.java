package com.collection.practical;


class Example<T>{

	T t;
	Example(T t){
		this.t=t;
	}
	public void display() {
		System.out.println(t);
	}
}



public class GenericClassExample {

	public static void main(String[] args) {

		Example <String>e=new Example<>("Hello");
		e.display();
		Example <Integer>e1=new Example<>(1);
		e1.display();
	}
}
