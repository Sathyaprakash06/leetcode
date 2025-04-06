class Solution {
    public int[] runningSum(int[] nums) {
        int[]arr=new int[nums.length];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            j+=nums[i];
            arr[k++]=j;
        }
        return arr;
    }
}