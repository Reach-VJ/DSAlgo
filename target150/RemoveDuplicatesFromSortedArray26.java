package target150;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray26 {

    public static void main(String [] args) {
        int [] array = {0,0,1,1,1,2,2,3,3,4};

        RemoveDuplicatesFromSortedArray26 obj = new RemoveDuplicatesFromSortedArray26();

        System.out.println("Final Array Length :"+obj.removeDuplicates(array));

    }

    public int removeDuplicates(int[] nums) {
        if(nums == null)
            return 0;
        if(nums.length < 2)
            return nums.length;

        int length = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]) {
                nums[length] = nums[i];
                i++;
            } else {

            }
            length++;
        }
        System.out.println(Arrays.toString(nums));
        return length;
    }
}
