class Solution {
    public int[] getConcatenation(int[] nums) {
        int[]newarr=new int[nums.length+nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
        newarr[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
        newarr[j++]=nums[i];
        }
    return newarr;}
}