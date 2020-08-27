package target150.onetoten;

public class MedinaOf2SortedArrays4 {

    public static void main(String[] args) {
        int[] x = {1, 3, 8, 9, 15};
        int[] y = {7, 11, 19, 21, 18, 25};

        MedinaOf2SortedArrays4 obj = new MedinaOf2SortedArrays4();

        double median = obj.findMedianSortedArrays(x,y);
        System.out.println(median);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1 == null || nums2 == null)
            return 0;
        if(nums1.length <=0 && nums2.length <= 0) {
           return 0;
        }

        if(nums1.length <=0 || nums2.length <= 0) {
            nums1 = nums1.length<=0 ? nums2:nums1;
            return findMedian(nums1);
        }

        if (nums1.length > nums2.length)
            findMedianSortedArrays(nums2, nums1);
        int x = nums1.length;
        int y = nums2.length;

        int low = 0;
        int high = x;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            //if partitionX is 0 it means nothing is there on left side. Use -INF for maxLeftX
            //if partitionX is length of input then there is nothing on right side. Use +INF for minRightX
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                //We have partitioned array at correct place
                // Now get max of left elements and min of right elements to get the median in case of even length combined array size
                // or get max of left for odd length combined array size.
                if ((x + y) % 2 == 0) {
                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) { //we are too far on right side for partitionX. Go on left side.
                high = low - 1;
            } else { //we are too far on left side for partitionX. Go on right side.
                low = low + 1;
            }
        }
        //Only we we can come here is if input arrays were not sorted. Throw in that scenario.
        throw new IllegalArgumentException();
    }

    double findMedian(int [] arrayElements) {
        int length = arrayElements.length;
        double median = 0;

        if(length%2==0) {
            median = (double)(arrayElements[(length-1)/2]+arrayElements[length/2])/2;
        } else {
            median = arrayElements[length/2];
        }
        return median;
    }
}
