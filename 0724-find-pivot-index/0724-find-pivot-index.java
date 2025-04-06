class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int sum1=0;
            for(int j=0;j<nums.length;j++){
                if(j>i){
                    sum+=nums[j];
                }
                if(j<i){
                    sum1+=nums[j];
                }
            }
            if(sum==sum1){
                return i;
            }
        }
        return -1;
    }
}