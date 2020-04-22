package com.test.anagtram;

public class Factorial {

	public static void main(String[] args) {
		int factorial = fact(5);
		System.out.println(factorial);

	}

	private static int fact(int i) {
		// TODO Auto-generated method stub
		// Using recursion

		if (i == 0) {
			return 1;
		} else {
			return i * fact(i - 1);
		}
	}
}
