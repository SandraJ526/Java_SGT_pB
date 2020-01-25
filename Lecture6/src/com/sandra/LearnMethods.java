package com.sandra;

public class LearnMethods {

	public static void main(String[] args) {
		getMyName();
		System.out.println("__________________________");
		getMyCity();
		
		LearnMethods classObject = new LearnMethods ();
		classObject.doYouHaveACat();
		
	}
	
	public static void getMyName () {
		
		System.out.println("My name is Sandra");
	}
	
	public static void getMyCity () {
		getMyName();
		
		System.out.println("My city is Riga");
		
	}
	
	public static void doYouHaveACat () {
		System.out.println("Yes");
	}

}
