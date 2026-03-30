/**
 * =========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class compares the performance of different palindrome checking
 * approaches using System.nanoTime().
 *
 * At this stage, the application:
 * - Runs multiple algorithms (e.g., Two-Pointer vs. StringBuilder reverse).
 * - Captures execution time for each approach.
 * - Displays the results.
 *
 * Key Concepts:
 * - System.nanoTime()
 * - Algorithm comparison
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Create a long palindrome string for noticeable performance difference
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            sb.append("a");
        }
        sb.append("b");
        for (int i = 0; i < 50000; i++) {
            sb.append("a");
        }

        String input = sb.toString();

        System.out.println("Input : (Large String of " + input.length() + " characters)");

        // Approach 1: Two-Pointer Technique
        long startTime1 = System.nanoTime();
        boolean result1 = checkWithTwoPointers(input);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("Two-Pointer Approach : " + duration1 + " ns (Result: " + result1 + ")");

        // Approach 2: StringBuilder Reverse
        long startTime2 = System.nanoTime();
        boolean result2 = checkWithStringBuilder(input);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("StringBuilder Approach : " + duration2 + " ns (Result: " + result2 + ")");

    }

    // Method for Two-Pointer algorithm
    private static boolean checkWithTwoPointers(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method for StringBuilder algorithm
    private static boolean checkWithStringBuilder(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
