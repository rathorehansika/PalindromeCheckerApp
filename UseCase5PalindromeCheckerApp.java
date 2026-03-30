import java.util.Stack;

/**
 * ===============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class demonstrates palindrome validation
 * by using a Stack data structure.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Pushes characters into a Stack
 * - Pops characters (which naturally reverses their order)
 * - Compares popped characters with the original string
 * - Displays the result on the console
 *
 * This use case introduces the Stack data structure
 * and the Last In First Out (LIFO) principle.
 *
 * @author Developer
 * @version 5.0
 */
public class UseCase5PalindromeCheckerApp {
    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < input.length(); i++) {
            if (stack.pop() != input.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
