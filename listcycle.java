/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        // Tortoise Hare method
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        // Iterate slow pointer by one and fast pointer by two nodes
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }

        return false;
    }
}
