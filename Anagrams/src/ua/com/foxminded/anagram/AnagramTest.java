package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void testReverseText() {
		Anagram tester = new Anagram();
		assertEquals(null, tester.reverseText(null));
		assertEquals("", tester.reverseText(""));
		assertEquals("abcd qwer", tester.reverseText("dcba rewq"));
		assertEquals("123 321", tester.reverseText("123 321"));
		assertEquals("!@#$ %^&*", tester.reverseText("!@#$ %^&*"));
		assertEquals("qwe1234rty 9876asdf", tester.reverseText("ytr1234ewq 9876fdsa"));
		assertEquals("qwe!@#$rty %^&*asdf", tester.reverseText("ytr!@#$ewq %^&*fdsa"));
		assertEquals("123!@#$456 %^&*9876", tester.reverseText("123!@#$456 %^&*9876"));
		assertEquals("123!@#$4ab qw&*9876", tester.reverseText("123!@#$4ba wq&*9876"));
	}

}
