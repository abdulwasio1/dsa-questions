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
    public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    ListNode prev = null;

while (current != null) {
    // if i don't write prev != null then....
    //At the first iteration, prev is null, so prev.data causes a NullPointerException.
    if (prev != null && prev.val == current.val) {
        prev.next = current.next;
    } else {
        prev = current;
    }
    current = current.next;
}
return head;
    }
}