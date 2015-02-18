package com.tutorial.arrays;

public class LoopsExample {
	static int ages[] = {10,20,49,3,4,5,6,7,8,9,1,2,3,4};
	
	public static void main(String[] args) {
//		displaySum(2,3);
		int result = calc(2,3);
		result = result + 10;
		System.out.println(result);
		
		int marks[] = getMeAllMarks();
	}
	
	public static int calc(int a , int b) {
		return a + b;
	}
	
	public static void displaySum(int a , int b){
		System.out.println(a+b);
	}
	
	public static int[] getMeAllMarks() {
		int [] marks = new int[100];
		
		// do some logic to fetch all the marks
		marks[0] = 12;
		marks[1] = 56;
		marks[80] = 67;
		
		return marks;
	}
	
	public static void forLoop() {
		for(int i = 0 ; i < ages.length ; i++) {
			System.out.println("index:"+i +" Value =\t" + ages[i]);
		}
		
		for(int val : ages) {
			System.out.println(val);
		}
	}
	
	public static void whileLoop() {
		int idx = 0;
		while(idx < ages.length) {
			System.out.println(ages[idx++]);
		}
	}
	
	public static void doWhileExample() {
		int idx = 0;
		do {
			System.out.println(ages[idx++]);
		} while (idx < ages.length);
	}
}