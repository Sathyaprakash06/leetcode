class Solution {
    public int findMiddleIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int sum1=0;
            for(int j=0;j<nums.length;j++){
                if(j>i){
                    sum+=nums[j];
                }
                else if(j<i){
                    sum1+=nums[j];
                }
            }if(sum==sum1){
                return i;
            }
        }return -1;
    }
}