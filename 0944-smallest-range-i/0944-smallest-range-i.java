class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=nums[0];
        int max=min;
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        return Math.max(0,max-k+-min-k);
    }
}