package com.reachingskies.geeksandgeeks.recursion;

public class PrintBinaryFormOfNumber {

    public static void main(String [] args) {
        PrintBinaryFormOfNumber.printBinaryForm(5);
    }

    static void printBinaryForm(int n) {
        if(n == 0)
            return;
        printBinaryForm(n/2);
        System.out.print(n%2);
    }
}
