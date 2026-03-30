import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ===============================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class demonstrates palindrome validation
 * by using a Deque (Double Ended Queue) data structure.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Inserts characters into a Deque
 * - Removes first and last elements
 * - Compares them until the Deque is empty or has 1 element left
 * - Displays the result on the console
 *
 * This use case introduces front and rear access,
 * providing optimized data handling without separate reversal structures.
 *
 * @author Developer
 * @version 7.0
 */
public class UseCase7PalindromeCheckerApp {
    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Remove first & last and compare until empty
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
