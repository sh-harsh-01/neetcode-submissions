class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int prev = prices[0];
        for(int i=1;i<prices.length;i++){
            profit = Math.max(profit,prices[i]-prev);
            if(prices[i]<prev){
                prev = prices[i];
            }
        }
        return profit;
    }
}