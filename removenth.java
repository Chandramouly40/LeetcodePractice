/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int sz = 30;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Convert the list to an array
        ListNode for_working = head;
        int[] arr = new int[sz];
        int last_index = 0;

        while (for_working != null) {
            arr[last_index++] = for_working.val;
            for_working = for_working.next;
        }

        //  Find index to be removed
        int index_to_be_removed = last_index - n;

        //  Build new linked list excluding the index_to_be_removed
        ListNode answer = null;
        ListNode temp = null;

        for (int i = 0; i < last_index; i++) {
            if (i == index_to_be_removed) continue;

            ListNode newNode = new ListNode(arr[i]);

            if (answer == null) {
                answer = newNode;
                temp = answer;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }

        return answer;
    }
}
