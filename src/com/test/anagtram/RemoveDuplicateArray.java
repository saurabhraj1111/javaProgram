package com.test.anagtram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
		int[] intArr = { 1, 1, 2, 2, 4, 5 };
		// int[] arr = removeDuplicate(intArr);
		int[] arr1 = removeDuplicateWOCollection(intArr);

		for (int i : arr1) {
			System.out.println(i);
		}
	}

	private static int[] removeDuplicateWOCollection(int[] intArr) {
		int len = intArr.length;
		int[] newArr = new int[len];
		int k = 0;
		// sort the array
		Arrays.sort(intArr);

		for (int i = 0; i < len - 1; i++) {
			if (intArr[i] != intArr[i + 1]) {
				newArr[k] = intArr[i];
				k++;
			}
		}
		newArr[k++] = intArr[len - 1];

		// display
		int countLen = 0;
		for (int i : newArr) {
			if (i != 0) {
				countLen++;
			}
		}
		// create new array of len count array
		int[] finArr = new int[countLen];
		for (int i = 0; i < countLen; i++) {
			if (newArr[i] != 0) {
				finArr[i] = newArr[i];
			}
		}
		return finArr;
	}

	private static int[] removeDuplicate(int[] intArr) {
		// TODO Auto-generated method stub
		// with HashSet
		List<Integer> list = new ArrayList<Integer>();
		for (int n : intArr) {
			list.add(n);
		}

		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
		return null;
	}

}
