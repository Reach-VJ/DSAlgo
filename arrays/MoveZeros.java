package com.reachingskies.arrays;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String [] args) {

		int [] elements = {1,2,3,4,0,5,6,0,8,0,9};
		MoveZeros moveZeros = new MoveZeros();
		System.out.println(Arrays.toString(moveZeros.moveZeros(elements)));
	}

	int [] moveZeros(int [] array) {

		int [] tempArray = new int[array.length];
		int j = 0;

		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0)
			{
				tempArray[j] = array[i];
				j++;
			}

		}

		return Arrays.copyOf(tempArray,j);
	}
}