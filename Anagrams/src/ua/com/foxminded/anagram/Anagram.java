package ua.com.foxminded.anagram;

import java.lang.StringBuilder;

public class Anagram {

	public static final String DELIMITER = " ";

	public String reverseText(String text) {
		String[] words = text.split(DELIMITER);
		StringBuilder result = new StringBuilder("");

		for (int i = 0; i < words.length; i++) {
			result.append(reverseWord(words[i]));
			if (i < words.length - 1) {
				result.append(DELIMITER);
			}
		}
		return result.toString();
	}

	private String reverseWord(String word) {
		char[] chars = word.toCharArray();
		int leftIndex = 0;
		int rightIndex = word.length() - 1;
		char buffer;

		boolean leftIsLetter = false;
		boolean rightIsLetter = false;

		while (leftIndex < rightIndex) {
			leftIsLetter = Character.isLetter(chars[leftIndex]);
			rightIsLetter = Character.isLetter(chars[rightIndex]);
			if (leftIsLetter && rightIsLetter) {
				buffer = chars[leftIndex];
				chars[leftIndex] = chars[rightIndex];
				chars[rightIndex] = buffer;
				leftIndex++;
				rightIndex--;
			}
			if ((!leftIsLetter) && (!rightIsLetter)) {
				leftIndex++;
				rightIndex--;
			}
			if (leftIsLetter && (!rightIsLetter)) {
				rightIndex--;
			}
			if ((!leftIsLetter) && rightIsLetter) {
				leftIndex++;
			}
		}

		return String.valueOf(chars);
	}
}
