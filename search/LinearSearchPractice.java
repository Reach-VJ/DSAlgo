package com.reachingskies.search;

public class LinearSearchPractice {

    public static void main(String [] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int searchElement = 11;
        LinearSearchPractice practice = new LinearSearchPractice();
        boolean findElement = practice.findElement(array,searchElement);
        System.out.println(searchElement +" found --> "+findElement);
    }

    public boolean findElement(int [] array, int searchElement) {
        if(array == null || array.length ==0 )
            return false;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == searchElement)
                return true;
        }
        return false;
    }
}
