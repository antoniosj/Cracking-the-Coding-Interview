package io.github.antoniosj.strings;

public class Question4 {

	public static boolean isPalindromePermutation(String s) {

		int[] letterCount = new int[128];
		int odd = 0;

		s = s.replaceAll(" ", "");
		for (int i = 0; i < s.length(); i++) {
			letterCount[s.charAt(i) - 'a']++;
		}

		for (int j = 0; j < letterCount.length; j++) {
			if (letterCount[j] % 2 != 0) {
				odd++;
			}
			if (odd > 1) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String input = "tac tc oa";
		System.out.println(isPalindromePermutation(input));
	}

}
