class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int max1=nums[0];
        for(int i=1;i<n;i++){
    max=Math.max(nums[i],max+nums[i]);
        max1=Math.max(max1,max);}
        return max1;
    }
}