package com.tianque.util;

public class FindStringOfWordUtil {

	public static String findStringOfWordPlace(String str, String letter, int num1,
			int num2) {
		int i = 0;
		int n = 0;
		if(str == null){
			return "";
		}
		int m = str.length();
		char c = new String(letter).charAt(0);
		char[] ch = str.toCharArray();
		for (int j = 0; j < ch.length; j++) {
			if (ch[j] == c) {
				i++;
				if (i == num1) {
					n = j;
				}
				if (i == num2) {
					m = j + 1;
					break;
				}
			}
		}
		return str.substring(n, m);
	}

}
