package com.test.anagtram;

public class LongestPrefixAndSuffix {

	public static void main(String[] args) {
		String result = getLongestPrefix("abckkcba");
		System.out.println("res:"+result);
	}

	private static String getLongestPrefix(String str) {
		// TODO Auto-generated method stub
		String result = null;
		int len = str.length();
		int matInd = 0;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == str.charAt(len -(1+i)) && i < len / 2) {
				matInd = i;
			}
		}
		//System.out.println(matInd);
		result = str.substring(0,matInd+1);

		return result;
	}

}
