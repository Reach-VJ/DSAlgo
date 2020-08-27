package com.reachingskies.geeksandgeeks.recursion;

public class Factorial {

    public static void main(String [] args) {
        int number = 10;
        Factorial factorial = new Factorial();
        int factorialValue = Factorial.factorial(number);
        System.out.println("Factorial of "+number+" --> "+factorialValue);
    }

    static int factorial(int n) {
        if(n == 0)
            return 1;
        return n*factorial(n-1);
    }
}
