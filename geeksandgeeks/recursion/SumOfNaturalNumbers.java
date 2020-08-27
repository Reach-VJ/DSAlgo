package com.reachingskies.geeksandgeeks.recursion;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

public class SumOfNaturalNumbers {

    public static void main(String [] args) {
        int number = 5;
        int sumOfNatural = SumOfNaturalNumbers.sumOfNaturalNumbers(1);
        System.out.println("Sum of natural numbers of "+number+" --> "+sumOfNatural);
    }

    static int sumOfNaturalNumbers(int number) {

        if(number == 0)
            return 0;

        return number+sumOfNaturalNumbers(number-1);
    }
}
