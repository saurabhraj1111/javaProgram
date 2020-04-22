package com.test.anagtram;

public class FirstNonRepetedChar {
	public static void main(String[] args) {

		char ch = nonRepeted("hhlo");
		System.out.println(ch);
	}

	private static char nonRepeted(String str) {
		// TODO Auto-generated method stub
		char res = 0;
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < charArr.length; j++) {
				if (i != j && charArr[i] == charArr[j]) {
					flag = true;
				}
			}

			if (!flag) {
				res = charArr[i];
				break;
			}

		}

		return res;
	}

}
