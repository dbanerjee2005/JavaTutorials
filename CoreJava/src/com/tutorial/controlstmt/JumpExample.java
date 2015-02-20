package com.tutorial.controlstmt;

public class JumpExample {

	public static void main(String args[]) {
		int totalMarks;
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			if (i % 2 == 0)
				continue;
			System.out.println("");
		}
		System.out.println("==================");
		int ages[] = {2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < 10; i++) {
			if(i == 5) continue;
			System.out.print(i + " ");
		}
	}
	
	public void helloWorld() {
		
	}
}