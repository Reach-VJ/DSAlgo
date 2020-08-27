package target150.finftyonetosixty;

/**
 * https://leetcode.com/problems/maximum-subarray/
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 *
 */
public class MaximumSubArray53 {
    public static void main(String [] args) {
        int [] elements = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArray53 obj = new MaximumSubArray53();
        int sum = obj.maxSubArray(elements);
        System.out.println(sum);
    }

    int maxSubArray(int [] elements){
        if(elements.length<2)
            return elements[0];

        int maxSoFar = elements[0];
        int maxEndingHere = elements[0];

        for(int i = 1; i < elements.length; i++) {
            //Max sum of elements until here.
            maxEndingHere = Math.max(maxEndingHere+elements[i],elements[i]);
            //Max of sum of elements here or Previous Max Sum.
            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }

        return maxSoFar;
    }

}
