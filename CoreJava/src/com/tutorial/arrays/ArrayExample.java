package com.tutorial.arrays;

public class ArrayExample {
	static int i = 90;
	static String name ="Nine";
	public static void main(String[] args) {
		intArray();
//		stringArray();
//		localVariable();
//		multiDimensionArray();
	}
	
	public static void localVariable() {
		System.out.println(i);
		System.out.println(name);
	}
	
	public static void stringArray() {
//		String names[] = {"ONE","TWO","THREE"};
		String names[] = new String[10];
		for(int i = 0 ; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for(String name : names) {
			System.out.println(name);
		}
	}
	public static void intArray() {
		int myage = 10;
		int yourAge = 20;
		int hisAge = 30;
		
		int ages[] = {10,20,hisAge,3,4,5,6,7,8,9,1,2,3,4};
//		int ages[] = new int[10];
		ages[5] = 50;
		ages[9] = 90;
		ages[10] = 100; // trying to fetch the 11th value
		/*for(int i = 0 ; i < ages.length ; i++) {
			System.out.println("index:"+i +" Value =\t" + ages[i]);
		}*/
		
//		for(each int in ages)
		/*for(int val : ages) {
			System.out.println(val);
		}*/
		int idx = 0;
		while(idx < ages.length) {
			System.out.println(ages[idx++]);
		}
		
	}
	
	public static void multiDimensionArray () {
		int age[] = {12,10};
		
		int ageHeights[][] = {age,
						   	 {23,56},
						   	 {100,46}};
//		System.out.println(ageHeight.length);
		for(int i = 0 ; i < ageHeights.length ; i++) {
			int ah[] = ageHeights[i];
			for(int j = 0; j < ah.length ; j++){
				System.out.print(ageHeights[i][j]+" ");
			}
			System.out.println();
		}
	}
}