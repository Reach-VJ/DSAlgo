package com.reachingskies.search;

public class BinarySearchPractice {

    public static void main(String [] ars) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int searchElement = 8;
        BinarySearchPractice practice = new BinarySearchPractice();
        boolean findElement = practice.findElement(array,searchElement);
        System.out.println(searchElement+" found element --> "+findElement);
    }

    public boolean findElement(int [] array, int searchElement) {
        int start = 0;
        int end = array.length;
        int mid;

        while(start <= end) {
            mid = start+(end-start)/2;
            if(array[mid] == searchElement)
                return true;
            if(array[mid] < searchElement)
                start = mid+1;
            else
                end = mid-1;
        }
        return false;
    }
}
