package misc.linkedlist;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode insertFirstNode(ListNode node) {
        node.next = this;
        return node;
    }

    public ListNode insertAtMiddle(ListNode node, int val) {
        ListNode p = this;
        while (p.val != val) {
            p = p.next;
        }
        ListNode temp = p.next;
        p.next = node;
        node.next = temp;
        return this;
    }

    public ListNode inserAtEnd(ListNode node) {
        ListNode p = this;
        while(p.next!=null){
            p = p.next;
        }

        p.next = node;
        node.next = null;
        return this;
    }

    public ListNode deleteNode(int val) {
        ListNode head = this;
        ListNode p1 = head;
        ListNode p2 = head.next;

        if(p1.val == val) {
            head = p2;
            return head;
        }
        else {
            while(p2.val!=val) {
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        p1.next = p2.next;
        return head;
    }

    public ListNode reverseNode(ListNode head) {

        ListNode current = head;
        ListNode next = null, previous = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
       return head;

    }

    public void printListNode(ListNode head) {
        if(head == null)
            return;
        while(head != null) {
            System.out.print(head.val+" --> ");
            head = head.next;
        }
        System.out.print("NULL");
    }

    public ListNode nthNode(ListNode head, int index) {
        int count = 0;
        ListNode current = head;
        while(current != null) {
            if(count == index)
                return current;
            count++;
            current = current.next;
        }

        return current;
    }
}
