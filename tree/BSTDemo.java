package com.reachingskies.tree;

import java.util.List;

public class BSTDemo {

    public static void main(String [] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(30);
        tree.insert(20);
        tree.insert(10);
        tree.insert(40);
        tree.insert(50);
        System.out.println(tree);

        //List list = tree.breadthFirstSearch();
        //System.out.println(list);

        System.out.println("Pre Order : ");
        tree.depthFirstSearchPreOrder(tree.root);
        System.out.println("\nIn Order : ");
        tree.depthFirstSearchInOrder(tree.root);
        System.out.println("\nPost Order : ");
        tree.depthFirstSearchPostOrder(tree.root);
    }
}
