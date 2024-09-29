package oop_abstract;

public abstract class Page {

	// can not create the object of abstract class
	// can have abstract + non abstract methods in abstract class
	
	//can we create the object of abstract.. class?
	//Ans: yes, but this will be called when you create the object of child class...
	
	//hidden default class....
	
	//in abstract class:
	//1. No (zero) abstract... method -- yes -- 0% abstraction
	//2. only abstract... method -- yes -- 100% abstraction
	//3. abstract + non abstract methods -- yes -- partial abstraction
	
	//Interface:100% abstraction
	
	public Page() {
		System.out.println("page ..default...const....");
	}
	
	public Page(int i) {
		System.out.println("page ..const..." + i);
	}
	

	public abstract void title();

	public abstract void url();

	public void timeOut() {
		System.out.println("page -- time out : 20 secs");
	}

	public final void displayLogo() {
		System.out.println("page -- displayLogo");
	}

}
