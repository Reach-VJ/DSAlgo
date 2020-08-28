package com.reachingskies.geeksandgeeks.hashing.images;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String [] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        //Adding element to HashSet
        hashSet.add(25);
        hashSet.add(35);
        hashSet.add(45);

        boolean overriding = hashSet.add(25);
        System.out.println("does it override --> "+overriding);

        //Search element from HashSet
        boolean find = hashSet.contains(25);

        System.out.println("Find the element --> "+find);

        //Remove element from HashSet
        boolean removed = hashSet.remove(25);

        System.out.println("Removed --> "+removed);

        //Iteration or Loop through
        Iterator<Integer> iterator = hashSet.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        //For loop
        for(Integer integer : hashSet) {
            System.out.print(integer+" ");
        }


    }

}
