
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {        // cycle detected
                // Step 2: Find start of cycle
                ListNode start = head;

                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }

                return start;          // cycle starting node
            }
        }

        return null; // no cycle
    }

    // Testing
    public static void main(String[] args) {

        /*
            3 → 2 → 0 → -4
                ↑       ↓
                ← ← ← ←
        */

        ListNode head = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // cycle here

        Solution obj = new Solution();
        ListNode result = obj.detectCycle(head);

        if (result != null)
            System.out.println("Cycle starts at: " + result.val);
        else
            System.out.println("No cycle");
    }
}