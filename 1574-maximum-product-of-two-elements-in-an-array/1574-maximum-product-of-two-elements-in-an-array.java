class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int s=nums[nums.length-1]-1;
        int s1=nums[nums.length-2]-1;
        return s*s1;
    }
}