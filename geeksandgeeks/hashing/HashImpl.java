package com.reachingskies.geeksandgeeks.hashing.images;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashImpl {
    int bucket;
    ArrayList<LinkedList<Integer>> table = new ArrayList<>();
    public HashImpl(int size) {
        bucket = size;
        for(int i = 0; i < bucket; i++) {
            table.add(new LinkedList<>());
        }
    }

    public HashImpl() {
        bucket = 7; //Default value.
    }

    void insert(int key) {
        int hashIndex = key%bucket;
        table.get(hashIndex).add(key);
    }

    void delete(int key) {
        int hashIndex = key%bucket;
        for(int i = 0; i < table.get(hashIndex).size(); i++) {
            if(table.get(hashIndex).get(i) == key)
                table.get(hashIndex).remove(i);
        }
    }

    boolean search(int key) {
        int hashIndex = key%bucket;
        if(table.get(hashIndex) != null)
            return table.get(hashIndex).contains(key);
        return false;
    }

    public static void main(String [] args) {
        HashImpl hashImpl = new HashImpl(11);
        hashImpl.insert(10);
        hashImpl.insert(75);
        hashImpl.insert(25);

        boolean isAvail = hashImpl.search(25);
        hashImpl.delete(25);
        isAvail = hashImpl.search(25);
    }
}
