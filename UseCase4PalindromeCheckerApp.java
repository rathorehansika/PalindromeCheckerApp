/**
 * ===============================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome validation
 * by converting the string to a character array
 * and using a two-pointer approach.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Converts the string to char[]
 * - Uses a two-pointer approach (start and end)
 * - Compares characters moving towards the center
 * - Displays the result on the console
 *
 * This use case introduces efficient comparison
 * without creating extra String objects.
 *
 * @author Developer
 * @version 4.0
 */
public class UseCase4PalindromeCheckerApp {
    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";

        // Convert string to char[]
        char[] charArray = input.toCharArray();

        boolean isPalindrome = true;

        // Use two-pointer approach
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Compare start & end characters
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
