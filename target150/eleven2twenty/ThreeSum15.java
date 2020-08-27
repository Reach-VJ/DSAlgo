package target150.eleven2twenty;

import java.util.*;

public class ThreeSum15 {
    public static void main(String [] args) {
        int [] array = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(array);
    }


    static public List<List<Integer>> threeSum(int[] nums) {

        //To avoid adding duplicate list of elements.
        Set<List<Integer>> result = new HashSet<>();

        if(nums == null || nums.length < 3)
            return Collections.emptyList();
        Arrays.sort(nums);
        int j,k,sum = 0;
        for(int i = 0; i < nums.length-2; i++) {
            j = i+1;
            k = nums.length-1;

            while(j < k) {
                sum = nums[i]+nums[j]+nums[k];
                if(sum == 0)
                    result.add(new ArrayList<>(Arrays.asList(nums[i],nums[j++],nums[k--])));
                else if(sum > 0) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
