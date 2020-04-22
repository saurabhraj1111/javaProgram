package com.test.anagtram;

public class ReverseNum {

	public static void main(String[] args) {
		int reverseNum = reverserNum(123);
		System.out.println("Reverse  no::"+reverseNum);
	}

	private static int reverserNum(int num) {
		// TODO Auto-generated method stub
		int result = 0;
		int rem;
		int rev=0;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		return rev;
	}
}
