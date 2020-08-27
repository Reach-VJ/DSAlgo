package misc.linkedlist;

public class ListDemo {
    public static void main(String [] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(4);
        node.next.next.next = new ListNode(5);

        ListNode temp = node.nthNode(node,2);
        System.out.println(temp.val);
        node.reverseNode(node);

        node = node.insertAtMiddle(new ListNode(3),2);
        node = node.insertFirstNode(new ListNode(0));
        ListNode endNode = new ListNode(6);
        endNode.next = new ListNode((7));
        node = node.inserAtEnd(endNode);
        node = node.deleteNode(6);
        System.out.println(node.val);
    }

}
