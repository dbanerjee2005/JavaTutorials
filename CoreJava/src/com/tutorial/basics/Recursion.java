package com.tutorial.basics;

public class Recursion {

	public static void main(String[] args) {
		int value = Factorial.fact(4);
		System.out.println(value);
	}
}

class Factorial {
	static int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}
}
