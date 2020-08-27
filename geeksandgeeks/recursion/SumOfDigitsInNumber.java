package com.reachingskies.geeksandgeeks.recursion;

public class SumOfDigitsInNumber {

    public static void main(String [] args) {
        int number = 253;
        int sumOfDigits = SumOfDigitsInNumber.sumOfDigits(253);
        System.out.println("Sum og digits of "+number+" --> "+sumOfDigits);
    }

    static int sumOfDigits(int number) {
        if(number < 10)
            return number;
        return sumOfDigits(number/10)+number%10;
    }

}
