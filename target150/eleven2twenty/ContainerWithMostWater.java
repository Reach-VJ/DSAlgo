package target150.eleven2twenty;

public class ContainerWithMostWater {

    public static void main(String [] ars) {
        int [] array = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater water = new ContainerWithMostWater();
        int maxArea = water.maxArea(array);
        System.out.println("Max Area --> "+maxArea);
    }

    int maxArea(int [] array) {
        int maxArea = 0;
        int l = 0, r = array.length-1;

        while(l < r) {
            maxArea = Math.max(maxArea, Math.min(array[l], array[r])*(r-l));
            if(array[l] < array[r])
                l++;
            else
                r--;
        }
        return maxArea;
    }
}
