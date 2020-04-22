package com.test.anagtram;

public class ReverseStringWord {

	public static void main(String[] args) {
		String str = "Hello Saurabh raj How are you";
		String revStr = getReverse(str);
		System.out.println(revStr);
		System.out.println(str.length() == revStr.length());
	}

	private static String getReverse(String str) {
		// TODO Auto-generated method stub
		String result = "";

		String[] strArr = str.split("\\s");
		for (int i = 0; i < strArr.length; i++) {
			String currStr = strArr[i];
			int len = currStr.length();
			String revCurStr = "";
			for (int j = len - 1; j >= 0; j--) {
				revCurStr += currStr.charAt(j) + "";
			}
			result += revCurStr + " ";
		}
		// trim result

		return result.trim();
	}

}
