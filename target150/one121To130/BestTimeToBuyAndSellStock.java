package target150.one121To130;

public class BestTimeToBuyAndSellStock {

    public static void main(String [] args) {
        int [] array = {7,1,5,3,6,4};
        //int [] array = {7,6,4,3,1};
        int maxProfit = BestTimeToBuyAndSellStock.maxProfit(array);
        System.out.println(maxProfit);
    }

    static int maxProfit(int [] array) {
        if(array == null || array.length <2)
            return 0;
        int maxCur = 0;
        int maxSofar = 0;

        for(int i = 1; i < array.length; i++) {
            maxCur = Math.max(0, maxCur+=array[i]-array[i-1]);
            maxSofar = Math.max(maxCur,maxSofar);
        }

        return maxSofar;

    }
}
