package de.fh.aachen.isqm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    // --- Tests for reverse() ---

    @Test
    public void testReverseSimpleWord() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    public void testReverseEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    public void testReverseNull() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testReverseWithSpaces() {
        assertEquals("dlroW olleH", StringUtils.reverse("Hello World"));
    }

    @Test
    public void testReverseWithUnicode() {
        assertEquals("😊界世 ,olleH", StringUtils.reverse("Hello, 世界😊"));
    }

    // --- Tests for isPalindrome() ---

    @Test
    public void testPalindromeSimple() {
        assertTrue(StringUtils.isPalindrome("madam"));
    }

    @Test
    public void testPalindromeWithMixedCase() {
        assertTrue(StringUtils.isPalindrome("RaceCar"));
    }

    @Test
    public void testPalindromeWithSpacesAndPunctuation() {
        assertTrue(StringUtils.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    public void testPalindromeEmptyString() {
        assertTrue(StringUtils.isPalindrome("")); // edge case: empty is considered a palindrome
    }

    @Test
    public void testPalindromeNull() {
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    public void testPalindromeSingleCharacter() {
        assertTrue(StringUtils.isPalindrome("x"));
    }

    @Test
    public void testPalindromeWithNumbers() {
        assertTrue(StringUtils.isPalindrome("12321"));
        assertFalse(StringUtils.isPalindrome("12345"));
    }
}
