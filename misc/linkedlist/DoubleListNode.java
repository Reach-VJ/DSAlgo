package misc.linkedlist;

public class DoubleListNode {
    public int val;
    public DoubleListNode next;
    public DoubleListNode previous;

    public DoubleListNode() {

    }

    public DoubleListNode(int val) {
        this.val = val;
        this.next = null;
        this.next = null;
    }

    public DoubleListNode(DoubleListNode next, int val, DoubleListNode previous) {
        this.val = val;
        this.previous = previous;
        this.next = next;
    }

    public DoubleListNode reverse(DoubleListNode node) {

        if(node == null || node.next == null)
            return node;

        DoubleListNode temp = null;
        DoubleListNode current = node;

        /* swap next and prev for all nodes of
         doubly linked list */
        while (current != null) {
            temp = current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.previous;
        }

        return node;
    }

    public void printListNode(DoubleListNode head) {
        if(head == null)
            return;
        while(head != null) {
            System.out.print(head.val+" --> ");
            head = head.next;
        }
        System.out.print("NULL");
    }
}
