package com.tutorial.basics.classes;

public class Golfer {
	
	public static void main(String[] args) {
		Golfer golf = new Golfer();
		golf.callMe();
		
		PlaysGolf pg = new Golfer().new PlaysGolf();  
	}
	
	class PlaysGolf {
		String name;
	}
	
	public void callMe(){
		
	}
} 