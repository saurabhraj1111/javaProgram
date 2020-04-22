package com.test.anagtram;

public class StringAlphanumeric {
	public static void main(String[] args) {
		String result = checkNumeric("Saurabh1");

	}

	private static String checkNumeric(String string) {
		// TODO Auto-generated method stub
		char[] charArr = string.toCharArray();
		boolean flag = false;
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] >= 0 ) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("with no ");
		} else {
			System.out.println("Alphabets ");
		}
		return null;
	}
}
