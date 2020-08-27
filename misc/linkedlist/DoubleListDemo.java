package misc.linkedlist;

public class DoubleListDemo {

    public static void main(String [] args) {
        DoubleListNode node1 = new DoubleListNode(1);
        DoubleListNode node2 = new DoubleListNode(2);
        DoubleListNode node3 = new DoubleListNode(3);
        DoubleListNode node4 = new DoubleListNode(4);
        DoubleListNode node5 = new DoubleListNode(5);

        node1.next = node2;
        node2.previous = node1;
        node2.next = node3;
        node3.previous = node2;
        node3.next = node4;
        node4.previous = node3;
        node4.next = node5;
        node5.previous = node4;

        DoubleListNode node = new DoubleListNode();
        node = node.reverse(node1);
        node.printListNode(node);
    }
}
