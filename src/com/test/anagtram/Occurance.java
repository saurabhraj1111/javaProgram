package com.test.anagtram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Occurance {

	public static void main(String[] args) {
		occurance("saurabh raj");
	}

	public static void occurance(String str) {
		char[] charArr;
		int len;
		Map<String, Integer> map = new HashMap();
		Set<String> keySet = new HashSet<>();

		// remove space
		String woSpace = str.replace(" ", "");
		// char array
		charArr = woSpace.toCharArray();
		len = charArr.length;
		// key sey
		keySet = map.keySet();
		// check if already available
		String matchedKey = null;

		for (int i = 0; i < len; i++) {
			boolean flag = false;
			for (String key : keySet) {
				if (key.equals(Character.toString(charArr[i]))) {
					flag = true;
					matchedKey = key;
					break;
				}
			}
			if (flag) {
				map.put(matchedKey, map.get(matchedKey) + 1);
			} else {
				map.put(Character.toString(charArr[i]), 1);
			}

		}

		// System.out.println("map" + map);
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " " + map.get(key));
		}

	}
}
