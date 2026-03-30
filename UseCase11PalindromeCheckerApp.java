/**
 * =========================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class validates a palindrome using Object-Oriented Design.
 *
 * At this stage, the application:
 * - Encapsulates checking logic inside a PalindromeChecker class.
 * - Exposes a checkPalindrome() method.
 *
 * Key Concepts:
 * - Encapsulation
 * - Single Responsibility Principle
 *
 * @author Developer
 * @version 11.0
 */

// Encapsulated Palindrome Service Class
class PalindromeChecker {
    /**
     * Checks if a string is a palindrome.
     * Uses internal array data structure for validation.
     *
     * @param str The string to check.
     * @return true if palindrome, false otherwise.
     */
    public boolean checkPalindrome(String str) {
        if (str == null)
            return false;

        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to check
        String input = "refer";

        // Create an instance of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Check if palindrome using the service class
        boolean isPalindrome = checker.checkPalindrome(input);

        // Display the input
        System.out.println("Input : " + input);

        // Display whether it is a palindrome
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
