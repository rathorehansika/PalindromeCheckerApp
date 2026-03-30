import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

/**
 * =========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class validates a palindrome using the Strategy Pattern.
 *
 * At this stage, the application:
 * - Defines a PalindromeStrategy interface.
 * - Implements StackStrategy and DequeStrategy.
 * - Injects the strategy dynamically at runtime.
 *
 * Key Concepts:
 * - Interface
 * - Polymorphism
 * - Strategy Pattern
 *
 * @author Developer
 * @version 12.0
 */

// 1. Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

// 2. Concrete Strategy - Stack
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String str) {
        if (str == null)
            return false;
        Stack<Character> stack = new Stack<>();
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            stack.push(str.charAt(i));
        }

        int start = (len % 2 == 0) ? len / 2 : len / 2 + 1;

        for (int i = start; i < len; i++) {
            if (stack.isEmpty() || stack.pop() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

// 3. Concrete Strategy - Deque
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String str) {
        if (str == null)
            return false;
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context Class
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String str) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set!");
        }
        return strategy.checkPalindrome(str);
    }
}

public class UseCase12PalindromeCheckerApp {

    /**
     * Application entry point for UC12.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "refer";
        PalindromeContext context = new PalindromeContext();

        // Display the input
        System.out.println("Input : " + input);

        // Using Stack Strategy
        context.setStrategy(new StackStrategy());
        System.out.println("Is Palindrome (Stack Strategy)? : " + context.executeStrategy(input));

        // Using Deque Strategy
        context.setStrategy(new DequeStrategy());
        System.out.println("Is Palindrome (Deque Strategy)? : " + context.executeStrategy(input));
    }
}
