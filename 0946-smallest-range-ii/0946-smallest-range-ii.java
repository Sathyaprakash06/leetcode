class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
       int s=nums[nums.length-1]-nums[0];
       int sc=s;
       for(int i=0;i<nums.length-1;i++){
        int max=Math.max(nums[i]+k,nums[nums.length-1]-k);
        int min=Math.min(nums[i+1]-k,nums[0]+k);
       s=max-min;
       sc=Math.min(sc,s);
       }
       return sc;
    }
}