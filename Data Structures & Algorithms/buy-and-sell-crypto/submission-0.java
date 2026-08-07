class Solution {
    public int maxProfit(int[] prices) {
         int i = 0 ;
        int ans = 0;
        for(int j = 0 ; j < prices.length ; j++){
            if(prices[j] < prices[i]){
                prices[i] = prices[j];
            }
            ans = Math.max(prices[j]-prices[i] , ans);
        }
        return ans ;
    }
}
