class Solution {
    public int maxProfit(int[] prices) {
        int prev = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            int curr = prices[i];
            if(curr<prev){
                prev = curr;
            }
            profit = Math.max(profit,curr-prev);
        }
        return profit;
    }
}
