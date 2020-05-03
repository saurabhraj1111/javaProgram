package com.test.anagtram;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 3, 3, 5, 5, 5, 6, 7, 8, 4 };
		String str = "saurabh raj kumar";
		findDuplicateInt(arr);
		// findDuplicateCharExt(str);

	}

	private static void findDuplicateInt(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		int count;
		for (int i = 0; i < len; i++) {
			count = 1;
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j] && i != j) {
					arr[j] = -1;
					count++;
				}
			}
			if (count > 1 && arr[i] != -1) {
				System.out.println(arr[i]);
			}

		}

	}

	private static void findDuplicateCharExt(String str) {
		// TODO Auto-generated method stub
		// remove space
		str = str.replace(" ", "");
		char[] charArr = str.toCharArray();
		int len = charArr.length;
		char[] depArr = new char[len];
		int count;
		for (int i = 0; i < len; i++) {
			count = 1;
			for (int j = i + 1; j < len; j++) {
				if (charArr[i] == charArr[j] && i != j) {
					charArr[j] = '0';
					count++;
				}
			}

			if (count > 1 && charArr[i] != '0') {
				System.out.println(charArr[i]);
			}
		}

	}

}
