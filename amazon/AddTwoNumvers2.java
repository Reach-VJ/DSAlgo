package com.reachingskies.amazon;

public class AddTwoNumvers2 {

    public static void main(String [] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(6);

        AddTwoNumvers2 addTwoNumvers2 = new AddTwoNumvers2();
        ListNode sumNode = addTwoNumvers2.addTwoNumbers(l1,l2);
        System.out.println(sumNode);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fake = new ListNode(0);
        ListNode p = fake;

        ListNode p1 = l1;
        ListNode p2 = l2;

        int carry = 0;
        while (p1 != null || p2 != null) {
            //Assigning Previous carry value
            int sum = carry;
            //Taking node values and adding to sum and assign next node to p1
            if (p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }

            //Taking node values and adding to sum and assign next node to p2
            if (p2 != null) {
                sum += p2.val;
                p2 = p2.next;
            }

            //If sum value is more than 9, subtract from 10 and make it remaining as sum.
            if (sum > 9) {
                carry = 1;
                sum = sum - 10;
            } else {
                carry = 0;
            }

            //Here initially p as fake node, assigning sum node to p.next. and make p as p.next.
            ListNode l = new ListNode(sum);
            p.next = l;
            p = p.next;
        }

        //don't forget check the carry value at the end
        if (carry > 0) {
            ListNode l = new ListNode(carry);
            p.next = l;
        }
        return fake.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
