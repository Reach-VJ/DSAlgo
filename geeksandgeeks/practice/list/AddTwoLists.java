package com.reachingskies.geeksandgeeks.practice.list;

public class AddTwoLists {

    public static void main(String [] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoLists addTwoLists = new AddTwoLists();
        ListNode listNode = addTwoLists.addTwoListNodes(l1,l2);
        addTwoLists.printListNode(listNode);
    }

    void printListNode(ListNode node) {

        while(node!=null) {
            System.out.print(" "+ node.val+" ");
            node = node.next;
        }
    }

    ListNode addTwoListNodes(ListNode l1, ListNode l2) {

        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode fake = new ListNode(0);
        ListNode p = fake;
        int carry = 0;
        int summary = 0;

        while(p1 != null && p2 != null) {
            summary = carry;
            summary += p1.val;
            p1 = p1.next;

            summary += p2.val;
            p2 = p2.next;

            if(summary > 9) {
                carry = 1;
                summary = summary - 10;
            } else {
                carry = 0;
            }

            ListNode l = new ListNode(summary);
            p.next = l;
            p = p.next;
        }

        if(carry > 0) {
            ListNode carryNode = new ListNode(carry);
            p.next = carryNode;
        }

        return fake.next;
    }
}



class ListNode {
    int val;
    ListNode next;

    public ListNode(){}

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
