/**
 * =========================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Singly Linked List.
 *
 * At this stage, the application:
 * - Converts string to linked list
 * - Reverses the second half
 * - Compares halves
 *
 * Key Concepts:
 * - Singly Linked List: Connected using node references.
 * - Node Traversal: Sequential access.
 * - Fast and Slow Pointer Technique: To find the middle.
 * - In-Place Reversal: Reverses without extra memory.
 *
 * @author Developer
 * @version 8.0
 */

public class UseCase8PalindromeCheckerApp {

    // Inner class representing a Node in a Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Application entry point for UC8.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to check
        String input = "refer";

        // Convert string to linked list
        Node head = null;
        Node tail = null;

        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Check if palindrome
        boolean isPalindrome = true;

        if (head != null && head.next != null) {
            // Find the middle of the linked list using fast and slow pointers
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // 'slow' is now at the middle. Reverse the second half.
            Node secondHalf = reverseList(slow);
            Node firstHalf = head;

            // Compare both halves
            Node temp1 = firstHalf;
            Node temp2 = secondHalf;

            while (temp2 != null) {
                if (temp1.data != temp2.data) {
                    isPalindrome = false;
                    break;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }

        // Display the input
        System.out.println("Input : " + input);

        // Display whether it is a palindrome
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Reverses a linked list in-place.
     *
     * @param head the head of the list to reverse
     * @return the new head of the reversed list
     */
    private static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
