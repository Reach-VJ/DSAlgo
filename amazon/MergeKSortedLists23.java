package com.reachingskies.amazon;

import java.util.PriorityQueue;

public class MergeKSortedLists23 {

    public static void main(String [] args) {
        //[1,4,5],[1,3,4],[2,6]]
        ListNode one = new ListNode(1);
        one.next = new ListNode(4);
        one.next.next = new ListNode(5);

        ListNode two = new ListNode(1);
        two.next = new ListNode(3);
        two.next.next = new ListNode(4);

        ListNode three = new ListNode(2);
        three.next = new ListNode(6);
        ListNode [] lists = new ListNode[]{one,two,three};

        MergeKSortedLists23 kSortedLists = new MergeKSortedLists23();
        ListNode finalNode = kSortedLists.mergeKLists(lists);
        MergeKSortedLists23.printNodes(finalNode);


    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length==0) return null;

        // PriorityQueue with comparator : To add node based on ascending order based on node value.
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.length, (a, b)-> a.val-b.val);

        //Taking dummy node with zero as head value.
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;

        // Adding Nodes to queue, they will add in acending order.
        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);
        //Iterating while loop to poll(remove head node) and
        // assign to first node to dummy and add next node to queue.
        //Sample input :  //[1,4,5],[1,3,4],[2,6]]
        while (!queue.isEmpty()){
            // Remove the node from queue and assign to tail/dummy :  tail/dummy 0 null
            tail.next=queue.poll(); //Tail/Dummy : 0 1 4 5 null
            // tail : 1 4 5
            tail=tail.next;

            // if 4 not null add 4 5 nodes to queue. Now to queue is {[1 3 5] [2 6] [4 5]}
            if (tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
    }

    static void printNodes(ListNode node) {
        if(node == null)
            return;

        while(node.next != null) {
            System.out.print(node.val+" ");
            node = node.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
