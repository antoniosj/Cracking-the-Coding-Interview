package io.github.antoniosj.strings;

import java.util.Arrays;

public class Question1 {

	/* Is Unique
	 * Implement an algorithm to determine if a string has all unique
	 * characteres. What if you cannot use additional data structures?
	 */

	// my first approach
	public static boolean hasAllUniqueChar(String value) {

		char[] c = value.toLowerCase().toCharArray();
		Arrays.sort(c);
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// O(n) approach
	public static boolean isUniqueChar2(String str) {

		if (str.length() > 256)
			return false;

		boolean[] char_set = new boolean[256]; // all false by default
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	// O(1) approach! 
	public static boolean isUniqueChar(String str) {

		int checker = 0;
		for (int i = 0; i < str.length(); i++){
			int val = str.charAt(i) - 'a';
			if ((checker & (i << val)) > 0){
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

	public static void main(String[] args) {

		String v = "craxkinc";
		System.out.println(hasAllUniqueChar(v));
		System.out.println(isUniqueChar2(v));
		System.out.println(isUniqueChar(v));

	}

}
