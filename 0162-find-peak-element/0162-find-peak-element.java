class Solution {
    public int findPeakElement(int[] nums) {
        int right=0;
        int left=nums.length-1;
        while(right<left){
            int mid=(right+left)/2;
            if(nums[mid]>nums[mid+1]){
                left=mid;
            }else{
            right=mid+1;
            }
        }
        return left;
    }
}