class Solution {
    public int firstMissingPositive(int[] nums) {
        int tar=1;
        for(int i:nums){
            if(i==tar){
                tar++;
            }}
            return tar;

        }

}