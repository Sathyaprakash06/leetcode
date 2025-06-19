class Solution {
    public int maxProfit(int[] prices) {
        int diff=0;
        int max1=0;
      for(int i=prices.length-1;i>=0;i--){
        diff=Math.max(diff,max1-prices[i]);
        max1=Math.max(max1,prices[i]);
      }
      return diff;
    }
}