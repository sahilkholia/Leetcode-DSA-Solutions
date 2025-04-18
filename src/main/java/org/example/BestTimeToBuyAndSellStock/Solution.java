package org.example.BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        int maxProf = 0;
        int diff;
        int l = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<=prices[l]){
                diff = 0;
                l = i;
            }else{
                diff = prices[i] - prices[l];
            }
            if(diff>maxProf){
                maxProf = diff;
            }
        }
        return maxProf;
    }
}
