/**
 * =========================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This class validates a palindrome by ignoring case and spaces.
 *
 * At this stage, the application:
 * - Normalizes the string using regular expressions (removes spaces,
 * converting to lowercase).
 * - Applies standard palindrome logic to the normalized string.
 *
 * Key Concepts:
 * - String preprocessing
 * - Regular expressions
 *
 * @author Developer
 * @version 10.0
 */

public class UseCase10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to check
        String input = "A man a plan a canal Panama";

        // 1. Normalize the string
        // Remove all non-alphanumeric characters (including spaces) and convert to
        // lowercase
        String normalizedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 2. Apply palindrome logic (Two-pointer technique is efficient here)
        boolean isPalindrome = true;
        int start = 0;
        int end = normalizedInput.length() - 1;

        while (start < end) {
            if (normalizedInput.charAt(start) != normalizedInput.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display the input
        System.out.println("Input : " + input);

        // Display whether it is a palindrome
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
