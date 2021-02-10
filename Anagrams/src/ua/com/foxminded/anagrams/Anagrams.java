package ua.com.foxminded.anagrams;

import java.util.Scanner;
//import java.util.regex.*;

public class Anagrams {

	public static void main(String[] args) {

		System.out.println("Enter source string:");
		Scanner scanner = new Scanner(System.in);
		String Source = scanner.nextLine();
		scanner.close();
		String[] SourceWords = Source.split(" ");
		String[] ResultWords = new String[SourceWords.length];
		String Word, Character;

		for (int i = 0; i < SourceWords.length; i++) {
			Word = SourceWords[i];
			ResultWords[i] = "";
			for (int j = Word.length() - 1; j >= 0; j--) {
				Character = Word.substring(j, j + 1);
				if (Character.matches("[a-zA-Z]"))
					ResultWords[i] += Character;
			}

			for (int j = 0; j < Word.length(); j++) {
				Character = Word.substring(j, j + 1);
				if (!Character.matches("[a-zA-Z]")) {
					ResultWords[i] = ResultWords[i].substring(0, j) + Character + ResultWords[i].substring(j);
				}
			}
			System.out.print(ResultWords[i]);
			if (ResultWords.length>i) System.out.print(" ");
		}
	}
}
