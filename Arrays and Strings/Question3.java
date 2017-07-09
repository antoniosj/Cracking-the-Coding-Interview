package io.github.antoniosj.strings;

public class Question3 {

	public static void getURLify(char[] input, int length) {
		int spaceCount = 0;

		for (int i = 0; i < length; i++) {
			if (input[i] == ' ') {
				spaceCount++;
			}
		}

		for (int j = length - 1, k = j + 2 * spaceCount; j >= 0; j--) {
			if (input[j] == ' ') {
				input[k--] = '0';
				input[k--] = '2';
				input[k--] = '%';
			} else {
				input[k] = input[j];
				k--;
			}
		}
	}

	public static void main(String[] args) {
		char[] i = new char[17];
		i[0] = 'M';
		i[1] = 'r';
		i[2] = ' ';
		i[3] = 'J';
		i[4] = 'o';
		i[5] = 'h';
		i[6] = 'n';
		i[7] = ' ';
		i[8] = 'S';
		i[9] = 'm';
		i[10] = 'i';
		i[11] = 't';
		i[12] = 'h';

		getURLify(i, 13);
		
		System.out.println(new String(i));
	}

}
