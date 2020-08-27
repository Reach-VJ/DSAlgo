package com.reachingskies.geeksandgeeks.recursion;

import com.reachingskies.geeksandgeeks.arrays.FindEquilibriumPoint;

public class Fibonachi {

    public static void main(String [] args) {
        int number = 7;
        int fibonachi = Fibonachi.fibonachi(number);
        System.out.println("Fibonachi of "+number+" --> "+fibonachi);

    }

    //Fibonachi series : 0 1 1 2 3 5 8 13....
    static int fibonachi(int number) {

        if(number<=1)
            return number;

        return fibonachi(number-1)+fibonachi(number-2);
    }

}
