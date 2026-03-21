class Solution {
    public int minimumPairRemoval(int[] nums) {
        int c=0;
        int n=nums.length;
        while(!sort(nums)){
            int[]arr=new int[n-1];
            int min=Integer.MAX_VALUE;
            int ind1=0;
            for(int i=0;i<nums.length-1;i++){
                if(min>(nums[i]+nums[i+1])){
                    min=nums[i]+nums[i+1];
                    ind1=i;
                }
            }
            int ind=0;
            for(int i=0;i<nums.length;i++){
                if(i==ind1){
                    arr[ind++]=min;
                    i++;
                }else{
                    arr[ind++]=nums[i];
                }
            }
            nums=arr;
            n--;
           c++;
        }
        return c;
    }
    public static boolean sort(int[]arr){
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
           return false;
            }
        }
        return true;
    }
}