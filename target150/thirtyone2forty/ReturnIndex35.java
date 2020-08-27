package target150.thirtyone2forty;

public class ReturnIndex35 {
    public static void main(String [] args) {
        int [] nums = {1,3,5,6};
        ReturnIndex35 obj = new ReturnIndex35();
        int index = obj.searchInsert(nums,3);
        System.out.println("Index :"+index);
    }

    public int searchInsert(int[] nums, int target) {

        int index = 0;
        int left = 0, right = nums.length;
        int mid = left+(right-left)/2;

        while (left <= right) {
            mid = left+(right-left)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                left = mid +1;
            else
                right = mid-1;
        }

//        for(int i = 0; i< nums.length; i++) {
//            if(nums[i] == target) {
//                return i;
//            }
//            if(nums[i] < target)
//                index = i+1;
//            if(target < nums[i])
//                index = 0;
//        }
        return index;
    }
}
