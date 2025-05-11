class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       int fact=1;
       int x=1;
       for(int i=0;i<nums.length;i++){
        fact=nums[n-1]*nums[n-2]*nums[n-3];
       x=nums[0]*nums[1]*nums[n-1];}
       return Math.max(fact,x);
    }
}