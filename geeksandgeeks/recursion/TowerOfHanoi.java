package com.reachingskies.geeksandgeeks.recursion;

public class TowerOfHanoi {

    public static void main(String [] args) {
        TowerOfHanoi.TOH(2,'a','b','c');
    }

    static void TOH(int number, char A, char B, char C) {
        if(number == 1) {
            System.out.println("Move 1 from "+A +" to "+ C);
            return;
        }
        TOH(number-1, A, C, B);
        System.out.println("Move "+number+" from "+A+" to "+C);
        TOH(number-1,B,A,C);
    }
}


