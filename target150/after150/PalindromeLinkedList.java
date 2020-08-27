package target150.after150;

import java.util.Stack;

public class PalindromeLinkedList {

	public static void main(String [] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);

		Solution solution = new Solution();
		System.out.println("Is Polindrome : " +solution.isPalindrome(head));
	}

}

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return false;
        if(head.next == null)
            return true;
    	Stack<Integer> stack = new Stack<>();
    	ListNode current = head;
    	while(current != null) {
    		stack.push(current.val);
    		current = current.next;
    	}
    	while(!stack.isEmpty()) {
    		if(head.val != stack.pop()) {
    			return false;
    		}
    		head = head.next;
    	}
    	return true;
    }
}

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
