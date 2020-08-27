package target150.twentyone2thirty;

import misc.linkedlist.ListNode;

public class Merge2SortedLists21 {

    public static void main(String [] args) {

        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(3);
        listNode1.next.next = new ListNode(5);
        listNode1.next.next.next = new ListNode(7);

        ListNode listNode2 = new ListNode(2);
        listNode2.next = new ListNode(4);
        listNode2.next.next = new ListNode(6);
        listNode2.next.next.next = new ListNode(8);

        Merge2SortedLists21 mergeSort = new Merge2SortedLists21();
        ListNode mergeNode = mergeSort.mergeTwoLists(listNode1,listNode2);
        System.out.println(mergeNode.val);


    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode sorting = null;
        ListNode newHead = null;

        if(l1.val <= l2.val) {
            sorting = l1;
            l1 = sorting.next;
        }
        else {
            sorting = l2;
            l2 = sorting.next;
        }
        newHead = sorting;

        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                sorting.next = l1;
                sorting = l1;
                l1 = sorting.next;

            }
            else {
                sorting.next = l2;
                sorting = l2;
                l2 = sorting.next;
            }
        }
        if(l1 == null) sorting.next = l2;
        if(l2 == null) sorting.next = l1;

        return newHead;
    }
}
