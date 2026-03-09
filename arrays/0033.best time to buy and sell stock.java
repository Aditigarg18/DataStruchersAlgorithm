class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxright=prices[n-1];
        int maxprofit=0;
        for(int i=n-2;i>=0;i--){
             maxright=Math.max(maxright,prices[i]);
             maxprofit=Math.max(maxprofit,maxright-prices[i]);
        }
        return maxprofit;
    }
}
