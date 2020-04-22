package com.test.anagtram;

public class Intersection {
	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 3, 6, 9 };
		int[] arr2 = { 1, 2, 15, 85, 9 };
		int[] common = intersect(arr1, arr2);

		System.out.println(common);
		for (int i : common) {
			if (i != 0) {
				System.out.println(i);
			}
		}
	}

	private static int[] intersect(int[] a, int[] b) {
		int lenA = a.length;
		int lenB = b.length;
		int len;
		if (lenA < lenB) {
			len = lenA;
		} else {
			len = lenB;
		}

		// new array
		int[] com = new int[len];
		int k = 0;
		for (int i = 0; i < lenA; i++) {
			for (int j = 0; j < lenB; j++) {
				if (a[i] == b[j]) {
					com[k] = a[i];
					k++;
				}
			}
		}
		return com;
	}
}
