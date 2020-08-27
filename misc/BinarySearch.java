package misc;

public class BinarySearch {

    public static void main(String [] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int find = 11;
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Search number "+find+" found in array : "+ binarySearch.binarySearch(nums,find));
    }

    boolean binarySearch(int [] nums, int find) {

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(low<=high) {
            mid = (low+high)/2;
            if(nums[mid] == find) {
                return true;
            }
            else if(find > nums[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return false;
    }

}

