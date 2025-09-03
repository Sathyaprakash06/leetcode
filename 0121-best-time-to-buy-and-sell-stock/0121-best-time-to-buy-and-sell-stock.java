class Solution {
    public int maxProfit(int[] p) {
        int diff=0;
        int max=0;
        for(int i=p.length-1;i>=0;i--){
            diff=Math.max(diff,max-p[i]);
            max=Math.max(max,p[i]);
        }
        return diff;
    }
}