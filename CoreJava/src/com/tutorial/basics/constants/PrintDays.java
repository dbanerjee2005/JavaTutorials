package com.tutorial.basics.constants;
enum Coffee {
	SMALL(1) , MEDIUM(2) , LARGE(3);
	private int value;
	private Coffee(int value) {
		this.value = value;
	}
	public int getValue(){
		return this.value;
	}
}

public class PrintDays {

	public static void main(String[] args) {
		CoffeeShop.buyCoffee(Coffee.MEDIUM);
	}
}
class CoffeeShop{
	public static void buyCoffee(Coffee size){
		/*if(size == Coffee.SMALL) {
			System.out.println("Small");
		}else if (size == Coffee.MEDIUM) {
			System.out.println("medium");
		}else if(size == Coffee.LARGE) {
			System.out.println("Large");
		}*/
		
		if(size.getValue() == 1) {
			System.out.println("Small");
		}else if (size.getValue() == 2) {
			System.out.println("medium");
		}else if(size.getValue() == 3) {
			System.out.println("Large");
		}
	}
}
