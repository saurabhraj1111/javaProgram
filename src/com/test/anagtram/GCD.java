package com.test.anagtram;

public class GCD {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 5, 8 };
		int[] arr2 = { 2, 4, 6, 10, 8 };
		// int[] arr1 = { 1, 2, 3, 5, 8 };
		int gcd = findGcd(arr2);
		System.out.println(gcd);

	}

	private static int findGcd(int[] arr) {
		// TODO Auto-generated method stub
		int result = 0;
		int len = arr.length;
		int first = arr[0];
		for (int i = 1; i < len; i++) {
			int rem = first % arr[i];
			if (rem == 0) {
				if (i == len - 1) {
					result = rem;
					break;
				} else {
					first = rem;
				}
			} else if (rem == 1) {
				result = 1;
				break;
			} else {

				if (i == len - 1) {
					result = rem;
					break;
				} else {
					first = rem;
				}
			}
		}
		return result;
	}
}
