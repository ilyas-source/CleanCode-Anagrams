package ua.com.foxminded.anagram;

public class Anagram {

	public static final String DELIMITER = " ";

	public String reverseText(String text) {
		String[] sourceWords = text.split(DELIMITER);
		String result = "";

		for (int i = 0; i < sourceWords.length; i++) {
			result += reverseWord(sourceWords[i]) + " ";
		}
		return result.substring(0, result.length() - 1);
	}

	private String reverseWord(String word) {
		String result = "";
		int forwardPointer = 0, backwardPointer = word.length() - 1;

		while (forwardPointer < word.length()) {

			while (backwardPointer >= 0) {
				if (!Character.isLetter(word.charAt(backwardPointer))) {
					backwardPointer--;
				} else {
					break;
				}
			}

			if (Character.isLetter(word.charAt(forwardPointer))) {
				result += word.substring(backwardPointer, backwardPointer + 1);
				backwardPointer--;
			} else {
				result += word.substring(forwardPointer, forwardPointer + 1);
			}
			forwardPointer++;
		}
		return result;
	}
}
