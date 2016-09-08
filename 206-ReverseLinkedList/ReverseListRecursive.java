/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class Solution {
	public ListNode reverseList(ListNode head) {
		ListNode curr = head;
		if (curr == null || curr.next == null) {
			return curr;
		}
		ListNode next = curr.next;
		ListNode newHead = reverseList(next);
		next.next = curr;
		curr.next = null;
		return newHead;
	}
}