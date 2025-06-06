package de.fh.aachen.isqm;

public class StringUtils {

    // Reverses the input string
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    // Checks if the input string is a palindrome (ignores case and non-alphanumeric chars)
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(reverse(cleaned));
    }
}
