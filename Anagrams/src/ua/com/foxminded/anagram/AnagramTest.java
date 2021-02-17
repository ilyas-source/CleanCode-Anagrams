package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

	Anagram anagram = new Anagram();

	@Test
	void givenNull_whenReverseText_thenGetNull() {
		assertEquals(null, anagram.reverseText(null));
	}

	@Test
	void givenEmptyString_whenReverseText_thenGetEmptyString() {
		assertEquals("", anagram.reverseText(""));
	}

	@Test
	void givenPlainWord_whenReverseText_thenGetReversedWord() {
		assertEquals("Hello", anagram.reverseText("olleH"));
	}

	@Test
	void givenMixedWord_whenReverseText_thenGetReversedWord() {
		assertEquals("qwe1234rty", anagram.reverseText("ytr1234ewq"));
	}

	@Test
	void givenNoLettersWord_whenReverseText_thenGetSameWord() {
		assertEquals("123!@#$456", anagram.reverseText("123!@#$456"));
	}

	@Test
	void givenPlainText_whenReverseText_thenGetReversedText() {
		assertEquals("Hello World", anagram.reverseText("olleH dlroW"));
	}

	@Test
	void givenMixedText_whenReverseText_thenGetReversedText() {
		assertEquals("qwe!@#$rt1 %^&*asdf", anagram.reverseText("tre!@#$wq1 %^&*fdsa"));
	}

	@Test
	void givenNoLettersText_whenReverseText_thenGetSameText() {
		assertEquals("123!@#$4 &*9876", anagram.reverseText("123!@#$4 &*9876"));
	}

}
