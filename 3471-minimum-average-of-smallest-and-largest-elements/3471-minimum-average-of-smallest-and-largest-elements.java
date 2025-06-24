class Solution {
    public double minimumAverage(int[] nums) {
        int st=0;
        int end=nums.length-1;
        double min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        while(st<=end){
            double avg=(double)(nums[st]+nums[end])/2;
            min=Math.min(min,avg);
            st++;
            end--;
        }
        return min;
    }
}