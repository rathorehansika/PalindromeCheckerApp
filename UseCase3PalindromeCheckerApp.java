/**
 * ===============================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This class demonstrates palindrome validation
 * by reversing the string using a loop and comparing
 * it with the original.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Reverses the string using a for loop
 * - Compares original and reversed strings using equals()
 * - Displays the result on the console
 *
 * This use case introduces string reversal logic
 * using concatenation to build the reversed string.
 *
 * @author Developer
 * @version 3.0
 */
public class UseCase3PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";

        // Reverse string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed using equals()
        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
