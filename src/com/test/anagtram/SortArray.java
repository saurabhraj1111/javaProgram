package com.test.anagtram;

public class SortArray {

	public static void main(String[] args) {
		int[] a = { 1, 5, 8, 4, 6,58,78,54};
		int[] arr = sortArray(a);
		System.out.println(arr);
		for (int i : arr) {
			System.out.println(i + " ");
		}
	}

	private static int[] sortArray(int[] a) {
		int len = a.length;
		// TODO Auto-generated method stub
		int[] sortedArr = new int[len];
		int temp;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (a[j] >= a[i]) {
					//System.out.println(a[j]);
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
