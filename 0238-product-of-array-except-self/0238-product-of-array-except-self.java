class Solution {
    public int[] productExceptSelf(int[] nums) {
        int fact=1;
        int ind=0;
        int[]arr=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            fact*=nums[i];
            else
            count++;
        }
        int s=0;
        for(int i=0;i<nums.length;i++){
       if(count>1){
        arr[i]=0;
       }else if(count==1){
        arr[i]=nums[i]==0?fact:0;
       }else{
        arr[i]=fact/nums[i];
       }}
       return arr;
    }
}