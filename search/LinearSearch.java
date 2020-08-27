package com.reachingskies.search;

public class LinearSearch {

	public static void main(String [] args) {
		int [] elements = {1,2,3,4,5,6,7,8,9,10};
		int searchElement = 7;
		LinearSearch search = new LinearSearch();

		boolean elementFind = search.findElement(elements,searchElement);
		System.out.println(searchElement +" founnd -> "+elementFind);
	}

	boolean findElement(int [] array, int searchElement) {

		for(int i = 0; i < array.length; i++) {

			if(array[i] == searchElement)
				return true;
		}

		return false;
	}
}
