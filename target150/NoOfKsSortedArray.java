package target150;

public class NoOfKsSortedArray {

    public static void main(String [] args) {
        int [] elements = {1,1,2,2,2,2,2,3,4,5,6,7,7,7,7,8,9,9,10};
        int k = 9;
        NoOfKsSortedArray obj = new NoOfKsSortedArray();

        System.out.println("Number of "+k+"s :" +obj.numbefOfKs(elements,k));
    }

    int numbefOfKs(int [] elements, int k) {
        int firstIndex = binarySearch(elements,k,true);
        int lastIndex = binarySearch(elements,k,false);
        return lastIndex-firstIndex+1;
    }

    int binarySearch(int [] elements, int k, boolean searchFirst) {
        int i = 0;
        int j = elements.length-1;
        int mid = 0;
        int result = -1;

        while(i<=j) {
            mid = (i+j)/2;
            if(elements[mid] == k) {
                result = mid;
                if(searchFirst)
                    j = mid -1;
                else
                    i = mid+1;
            }
            else if(k > elements[mid])
                i = mid+1;
            else
                j = mid -1;
        }
        return result;
    }
}
