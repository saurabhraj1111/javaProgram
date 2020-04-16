package com.test.anagtram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		boolean result = checkAnalog("raj k", "kaja");
		if (result) {
			System.out.println("Analog");
		} else {
			System.out.println("Not Analog");
		}

	}

	private static boolean checkAnalog(String a, String b) {
		// TODO Auto-generated method stub
		boolean status = false;
		if (a.length() != b.length()) {
			status = false;

		} else {
			// remove space
			a = a.replace(" ", "");
			b = b.replace(" ", "");
			// convert into char array
			char[] aArr = a.toCharArray();
			char[] bArr = b.toCharArray();
			// sort
			Arrays.sort(aArr);
			Arrays.sort(bArr);
			System.out.println(aArr);
			System.out.println(bArr);
			// check equals
			status = Arrays.equals(aArr, bArr);
		}
		return status;
	}
}