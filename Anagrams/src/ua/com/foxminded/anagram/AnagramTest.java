package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

	Anagram anagram = new Anagram();

	@Test
	void givenNull_onReverseText_getNull() {
		assertEquals(null, anagram.reverseText(null));
	}

	@Test
	void givenEmptyString_onReverseText_getEmptyString() {
		assertEquals("", anagram.reverseText(""));
	}

	@Test
	void givenPlainWord_onReverseText_getReversedWord() {
		assertEquals("Hello", anagram.reverseText("olleH"));
	}

	@Test
	void givenMixedWord_onReverseText_getReversedWord() {
		assertEquals("qwe1234rty", anagram.reverseText("ytr1234ewq"));
	}

	@Test
	void givenNoLettersWord_onReverseText_getSameWord() {
		assertEquals("123!@#$456", anagram.reverseText("123!@#$456"));
	}

	@Test
	void givenPlainText_onReverseText_getReversedText() {
		assertEquals("Hello World", anagram.reverseText("olleH dlroW"));
	}

	@Test
	void givenMixedText_onReverseText_getReversedText() {
		assertEquals("qwe!@#$rt1 %^&*asdf", anagram.reverseText("tre!@#$wq1 %^&*fdsa"));
	}

	@Test
	void givenNoLettersText_onReverseText_getSameText() {
		assertEquals("123!@#$4 &*9876", anagram.reverseText("123!@#$4 &*9876"));
	}

}
