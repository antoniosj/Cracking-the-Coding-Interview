package io.github.antoniosj.strings;

/** One Way
 * There are three types of edits that can be performed on strings: Insert a
 * character, remove a character, or replace a character. Given two strings,
 * write a function to check if they are one edit (or zero edits) way.
 **/

public class Question5 {

	public static boolean isOneWayEdit(String a, String b) {

		int abs = Math.abs(a.length() - b.length());
		boolean isOneWay = false;
		if (abs > 1) {
			return false;
		}
		int count = 0;
		int verify = 0;

		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != b.charAt(i)) {
					count++;
				}
				if (count > 1) {
					return false;
				}
			}
		} else if (a.length() + 1 == b.length()) {
			isOneWay = checkInsertDifference(a,b);
		} else if (a.length() == b.length() + 1) {
			isOneWay = checkInsertDifference(b, a);
		}

		return isOneWay;
	}

	public static boolean checkInsertDifference(String shorter, String longer) {

		int shorterIndex = 0;
		int longerIndex = 0;
		int isOneWay = 0;
		while (shorterIndex < shorter.length() && longerIndex < longer.length()){
			if (shorter.charAt(shorterIndex) != longer.charAt(longerIndex)){
				longerIndex++;
				isOneWay++;
			} else {
				shorterIndex++;
				longerIndex++;
			}		
		}
		
		if (isOneWay > 1){
			return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		String a = "ale";
		String b = "aple";
		
		System.out.println(isOneWayEdit(a,b));
	}

}
