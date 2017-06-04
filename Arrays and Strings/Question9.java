package io.github.antoniosj.strings;

/* String rotation
 *  Assume you have a method isSubstring which checks if one word is a substring
 *  of another. Given two strings, s1 and s2, wirte code to check if s2 is a 
 *  rotation of s1 using only one call isSubstring.
 */

public class Question9 {

	public static boolean isSubstring(String s1, String s2) {
		
		if (s1.length() != s2.length()){
			return false;
		}
		
		String s1s1 = s1+s1;
		boolean b = s1s1.indexOf(s2) > 0;		
		return b;
	}

	public static void main(String args[]) {
		String s = "waterloo";
		String b = "loowater";
		
		System.out.println(isSubstring(s, b));
	}
	
}
