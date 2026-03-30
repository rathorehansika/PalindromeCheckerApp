import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ===============================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome validation
 * by using both Queue (FIFO) and Stack (LIFO) data structures.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Enqueues characters into a Queue
 * - Pushes characters into a Stack
 * - Compares dequeue vs pop output
 * - Displays the result on the console
 *
 * This use case introduces the behavioral difference
 * between LIFO and FIFO structures.
 *
 * @author Developer
 * @version 6.0
 */
public class UseCase6PalindromeCheckerApp {
    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
