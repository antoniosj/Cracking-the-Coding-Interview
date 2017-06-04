package io.github.antoniosj.strings;

import java.util.HashMap;

/*
 * String Compression
 * 
 * Implement a method to perform basic string compression using the counts of repeated characters. For example, the string
 * aabcccccaaa would become a2b1c5a3. If the compressed string would not become smaller than the original string your method should
 * return the original string. You can assume the string has only uppercase and lowercase letters (a-z)
 * */

public class Question6 {

	public static String compress(String s){
		
		
		int count = 1;
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - 1){
				sb.append(s.charAt(i));
				sb.append(count);
				break;
			}
			
			if (s.charAt(i) == s.charAt(i+1)){
				count++;
			} else {
				sb.append(s.charAt(i));
				sb.append(count);
				count = 1;
			}
		
		}
		
		String s2 = sb.toString();
		if (s2.length() >= s.length()){
			return s;
		}
		return s2;
	}
	
	
	public static void main(String[] args) {
		System.out.println(compress("abbbbbbbcab"));
	}
}
