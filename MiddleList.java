
import java.util.*;

// Definition of ListNode
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Move fast twice and slow once
        while (fast != null && fast.next != null) {
            slow = slow.next;        // 1 step
            fast = fast.next.next;  // 2 steps
        }

        return slow; // slow is the middle
    }
}

public class MiddleList {

    // Method to create linked list from array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Method to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input values
        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create linked list
        ListNode head = createList(arr);

        System.out.print("Linked List: ");
        printList(head);

        // Find middle node
        Solution sol = new Solution();
        ListNode middle = sol.middleNode(head);

        // Output
        System.out.println("Middle Node Value: " + middle.val);

        sc.close();
    }
}