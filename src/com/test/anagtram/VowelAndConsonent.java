package com.test.anagtram;

public class VowelAndConsonent {

	public static void main(String[] args) {
		vowelnCons("saurabh raj");

	}

	private static void vowelnCons(String str) {
		int vowel = 0;
		int cons = 0;

		// lower
		str = str.toLowerCase();
		// trim
		str = str.replace(" ", "");
		// to chat
		char[] charArr = str.toCharArray();
		// TODO Auto-generated method stub
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u') {
				vowel++;
			} else {
				cons++;
			}
		}

		System.out.println("vowel:" + vowel + "Cons:" + cons);
	}
}
