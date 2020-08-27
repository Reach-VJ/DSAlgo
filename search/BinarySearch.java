package com.reachingskies.search;

public class BinarySearch {

    public static void main(String [] args) {
        int [] elements = {1,2,3,4,5,6,7,8,9,10};
        BinarySearch search = new BinarySearch();
        System.out.println("Element fount -> "+search.findNumber(elements,10));
    }

    boolean findNumber(int [] elements, int target) {

        int left = 0;
        int right = elements.length-1;
        int mid = 0;


        while(left <= right) {
            mid = left + (right -left)/2;
            if(elements[mid] == target)
                return true;
            if(elements[mid] < target)
                left = mid+1;
            if(elements[mid] > target)
                right = mid-1;
        }

        return false;
    }
}
