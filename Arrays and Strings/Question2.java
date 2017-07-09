package io.github.antoniosj.strings;

import java.util.HashMap;

public class Question2 {

	
	public static boolean isPermutation(String a, String b){
		
		int[] letterCount = new int[52];
		
		if (a.length() != b.length()){
			return false;
		}
		
		for (int i = 0; i < a.length(); i++) {
			letterCount[a.charAt(i) - 'a'] += 1;
			letterCount[b.charAt(i) - 'a'] += 1;
		}
		
		for (int j = 0; j < 52; j++) {
			if ((letterCount[j] % 2) != 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(isPermutation("abc","cca"));

	}

}
