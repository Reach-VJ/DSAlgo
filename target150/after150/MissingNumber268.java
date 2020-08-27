package target150.after150;

import java.util.Arrays;

public class MissingNumber268 {

    public static void main(String [] args) {
        int [] array = {0,2,3};
        //int [] array = {0};
        MissingNumber268 missing = new MissingNumber268();
        System.out.println(missing.missingNumber(array));
    }

    public int missingNumber(int[] nums) {
        int sum = nums.length*(nums.length+1)/2;
        for(int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];
        }
        return sum;
    }
}
