package target150.after150;

import misc.linkedlist.ListNode;

public class ReverseLinkedList206 {
    public static void main(String [] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(4);
        node.next.next.next = new ListNode(5);

        ReverseLinkedList206 reverse = new ReverseLinkedList206();
        ListNode reverseNode = reverse.reverseList(node);
        reverseNode.printListNode(null);
    }

    ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode previous = null;
        while(head != null) {
            next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;
    }




}
