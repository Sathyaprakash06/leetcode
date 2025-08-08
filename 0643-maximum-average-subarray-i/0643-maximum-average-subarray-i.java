class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum1=0;
       for(int i=0;i<k;i++){
        sum1+=nums[i];
       }
       double max=sum1;
       for(int i=k;i<nums.length;i++){
        sum1+=nums[i]-nums[i-k];
        max=Math.max(max,sum1);
       }
       return  max/k ;
    }
}