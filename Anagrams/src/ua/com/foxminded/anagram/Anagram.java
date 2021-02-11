package ua.com.foxminded.anagram;

import java.util.Scanner;

public class Anagram {

	public void reverse(String string) {

		System.out.println("Enter text:");
		Scanner scanner = new Scanner(System.in);
		String source = scanner.nextLine();
		scanner.close();
		final String DELIMITER = " ";
		String[] words = source.split(DELIMITER);

		String word, reversedWord;
		int i, j;

		for (int k = 0; k < words.length; k++) {
			word = words[k];
			reversedWord = reverseWord(word);
			i = 0;
			j = 0;
			while (i < word.length()) {
				if (!Character.isLetter(word.charAt(i)))
					i++;
				else {
					word = word.substring(0, i) + reversedWord.substring(j, j + 1) + word.substring(i + 1);
					j++;
					i++;
				}
			}
			System.out.print(word);
			if (words.length > k)
				System.out.print(" ");
		}
	}

	private static String reverseWord(String word) {

		String output = "";
		for (int j = word.length() - 1; j >= 0; j--) {
			if (Character.isLetter(word.charAt(j)))
				output += word.substring(j, j + 1);
		}

		return output;

	}

}
