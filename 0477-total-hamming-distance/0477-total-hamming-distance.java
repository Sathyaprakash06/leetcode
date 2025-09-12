class Solution {
    public int totalHammingDistance(int[] nums) {
        int sum1=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
            int sum=nums[i]^nums[j];
             sum1+=Integer.bitCount(sum);}
        
        }
        return sum1;
    }
    }