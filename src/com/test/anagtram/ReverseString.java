package com.test.anagtram;

public class ReverseString {

	public static void main(String[] args) {

		String revStr = reverse("Saurabh raj");
		System.out.println("reverse ::" + revStr);

	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		String result = "";
		int n = str.length();
		for (int i = n - 1; i >= 0; i--) {
			result += str.charAt(i) + "";
		}
		return result;
	}

}
