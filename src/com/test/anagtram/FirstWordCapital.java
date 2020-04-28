package com.test.anagtram;

public class FirstWordCapital {

	public static void main(String[] args) {
        //first word capital 
		String str = getFormatedStr("hello saurabh raj");
		System.out.println(str);
	}

	private static String getFormatedStr(String str) {
		// TODO Auto-generated method stub
		String result = "";
		String[] strArr = str.split("\\s");

		for (int i = 0; i < strArr.length; i++) {
			// System.out.println("" + strArr[i]);
			String curStr = strArr[i];
			String currResult = "";
			for (int j = 0; j < curStr.length(); j++) {
				if (j == 0) {
					char first = curStr.charAt(0);
					currResult += Character.toString(first).toUpperCase();
				} else {
					currResult += Character.toString(curStr.charAt(j));
				}
			}
			result += currResult + " ";
		}

		return result.trim();
	}
}
