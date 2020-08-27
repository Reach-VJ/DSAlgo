package com.reachingskies.geeksandgeeks.list;

public class ListNodeImpl {

    public static void main(String [] args) {
        ListNode head = new ListNode(10);
        ListNode temp1 = new ListNode(20);
        ListNode temp2 = new ListNode(30);
        ListNode temp3 = new ListNode(5);
        head.next = temp1;
        temp1.next = temp2;
        //ListNode.printNodes(head);
        ListNode.printNodeRec(head);
        int positionOfNode = ListNode.poistiongOfListNode(head,30);
        System.out.println("\nPosition of node 30 --> "+positionOfNode);
        int positionOfNodeRec = ListNode.positionOfNodeRecursion(head,30);
        System.out.println("Position of node 30 --> "+positionOfNodeRec);
        ListNode.insertNodeAtFirst(head,temp3);
        ListNode headNode = ListNode.insertNodeAtEnd(head,40);
        ListNode.printNodeRec(headNode);
        ListNode deleteFirstNode = ListNode.deleteNodeAtFirst(head);
        System.out.println();
        ListNode.printNodeRec(deleteFirstNode);
        ListNode.deleteNodeAtEnd(head);

    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        next = null;
    }


    static ListNode deleteNodeAtEnd(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode current = head;

        while(current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        printNodeRec(head);
        return head;
    }
    static ListNode deleteNodeAtLast(ListNode head) {
        if(head == null  || head.next == null)
            return null;
        ListNode current = head;

        while(current.next.next != null) {
            current = current.next;
        }
        current.next = null;

        return head;

    }

    static ListNode deleteNodeAtFirst(ListNode head) {
        if(head == null)
            return head;
        return head.next;
    }

    static void insertNodeAtFirst(ListNode head, ListNode node) {
        if(head == null || node == null)
            return;
        node.next = head;
        head = node;
        ListNode.printNodeRec(head);
    }

    static ListNode insertNodeAtEnd(ListNode head, int val) {
        if(head == null) {
            head = new ListNode(val);
            return head;
        }
        return insertNodeAtEnd(head.next,val);
    }

    static void printNodes(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.val+" ");
            current = current.next;
        }
    }

    static void printNodeRec(ListNode head) {
        if(head == null)
            return;
        System.out.print(head.val+" ");
        printNodes(head.next);
    }

    static int poistiongOfListNode(ListNode head, int nodeVal) {
        int position = -1;
        while (head != null) {
            position++;
            if (head.val == nodeVal) {
                return position;
            } else {
                head = head.next;
            }

        }
        return -1;
    }

    static int poistionOfNodeRec(ListNode head,int nodeVal,int position) {
        if(head == null)
            return -1;
        if(head.val == nodeVal)
            return position;
        position++;
        return poistionOfNodeRec(head.next,nodeVal,position);
    }

    static int positionOfNodeRecursion(ListNode head, int nodeVal) {
        if(head == null)
            return -1;
        if(head.val == nodeVal)
            return 0;
        else {
            int result = positionOfNodeRecursion(head.next,nodeVal);
            if(result == -1)
                return -1;
            else
                return result+1;
        }
    }


}
