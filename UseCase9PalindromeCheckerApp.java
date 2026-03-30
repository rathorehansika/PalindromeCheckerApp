/**
 * =========================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * At this stage, the application:
 * - Uses a recursive call to compare start and end characters.
 * - Uses a base condition to exit recursion.
 *
 * Key Concepts:
 * - Recursion: Method calls itself.
 * - Base Condition: Prevents infinite recursion.
 * - Call Stack: Manages method calls during recursion.
 *
 * @author Developer
 * @version 9.0
 */

public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to check
        String input = "refer";

        // Check if palindrome using recursion
        boolean isPalindrome = checkPalindromeRecursively(input, 0, input.length() - 1);

        // Display the input
        System.out.println("Input : " + input);

        // Display whether it is a palindrome
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursive method to check for palindrome.
     *
     * @param str   the string to check
     * @param start the starting index
     * @param end   the ending index
     * @return true if palindrome, false otherwise
     */
    private static boolean checkPalindromeRecursively(String str, int start, int end) {
        // Base condition: If pointers crossed or met, it is a palindrome
        if (start >= end) {
            return true;
        }

        // If characters at start and end do not match, not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call comparing inner bounds
        return checkPalindromeRecursively(str, start + 1, end - 1);
    }
}
