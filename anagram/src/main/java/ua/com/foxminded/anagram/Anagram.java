package ua.com.foxminded.anagram;

public class Anagram {

	public static final String DELIMITER = " ";

	public String reverseText(String text) {
		if (text == null) {
			return null;
		}
		String[] words = text.split(DELIMITER);
		StringBuilder result = new StringBuilder();

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

		while (leftIndex < rightIndex) {
			if (!Character.isLetter(chars[leftIndex])) {
				leftIndex++;
			} else {
				if (!Character.isLetter(chars[rightIndex])) {
					rightIndex--;
				} else {
					char buffer = chars[leftIndex];
					chars[leftIndex] = chars[rightIndex];
					chars[rightIndex] = buffer;
					leftIndex++;
					rightIndex--;
				}
			}
		}

		return String.valueOf(chars);
	}
}
