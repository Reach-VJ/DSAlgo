package com.reachingskies.geeksandgeeks.recursion;

public class Permutation {

    public static void main(String [] args) {
        String str = "abc";
        Permutation.printSub(str,"",0);
    }

    static void printSub(String str, String current, int index) {

        if(index == str.length()) {
            System.out.print(" --> "+current+" ");
            return;
        }

        printSub(str,current,index+1);
        printSub(str,current+str.charAt(index),index+1);
    }
}
