package ua.com.foxminded.anagram;

import java.util.Scanner;

public class Main {
	private static Anagram anagram;

	public static void main(String[] args) {

		System.out.println("Enter text:");
		Scanner scanner = new Scanner(System.in);
		String source = scanner.nextLine();
		scanner.close();

		anagram = new Anagram();
		System.out.println(anagram.reverseText(source));
	}
}