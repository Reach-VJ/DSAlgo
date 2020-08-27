package target150.onetoten;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static void main(String [] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 18;

        int [] indicies = new TwoSum1().twoSum1(nums,target);
        System.out.println(indicies[0]+" : "+nums[0]+"\n"+
                indicies[1]+" : "+nums[1]);
    }

    //Brute force
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

    //Better Approach
    public int [] twoSum1(int [] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target-nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement),i};
            } else {
                map.put(nums[i],i);
            }
        }

        return new int[]{0,0};
    }
}
