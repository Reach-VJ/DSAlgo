package com.reachingskies.arrays;

public class ReverseInteger {

	public static void main(String [] args) {
		Solution solution = new Solution();
		System.out.println(solution.reverse(-456));
	}

}

class Solution {

	int reverse(int x) {
		long result = 0;
		int fact = x;

		while(fact != 0) {
			result = result*10 + fact%10;
			fact = fact/10;
		}

		return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int) result;

	}
}
