package com.test.anagtram;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String str = "hi hi i am am am Raj Raj";
		String result = removeDuplicate(str);
		String printDup = printDuplicate(str);

	}

	private static String printDuplicate(String str) {
		// TODO Auto-generated method stub
		String[] strArr = str.split("\\s");
		int len = strArr.length;
		String res = "";
		for (int i = 0; i < len; i++) {
			boolean flag = false;
			for (int j = 0; j < len; j++) {
				if (strArr[i] != null && strArr[j] != null) {
					if (strArr[i].equals(strArr[j]) && i != j) {
						strArr[j] = null;
						flag = true;
					}
				}

			}
			if (flag && strArr[i] != null) {
				System.out.println(strArr[i]);
			}
		}

		return null;
	}

	private static String removeDuplicate(String str) {

		String[] strArr = str.split("\\s");
		int len = strArr.length;
		String res = "";
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (strArr[i].equals(strArr[j]) && i != j) {
					strArr[j] = " ";
				}

			}
		}

		for (String s : strArr) {
			if (s != " ") {
				res += s + " ";
			}
		}
		System.out.println(res.trim());

		return null;
	}
}
