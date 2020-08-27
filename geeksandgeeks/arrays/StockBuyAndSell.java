package com.reachingskies.geeksandgeeks.arrays;

public class StockBuyAndSell {
    public static void main(String [] args) {
        //int [] array = {1,5,3,8,12};
        int [] array = {1,5,3,2,8,12,14,15};
        StockBuyAndSell buyAndSell = new StockBuyAndSell();
        int maxProfit = buyAndSell.maxProfit(array);
        System.out.println("Max profit : "+ maxProfit);
    }

    /*
     * Calculate lowest point to highest point, repeast the process to calculate max profit.
     *
     */
    int maxProfit(int [] array) {
        int maxProfit = 0;

        for(int i = 1; i < array.length; i++) {
            if(array[i] > array[i-1]) {
                maxProfit = maxProfit+ array[i]- array[i-1];
            }
        }
        return maxProfit;
    }
}
