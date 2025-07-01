class Solution {
    public int maxIceCream(int[] nums, int coins) {
        Arrays.sort(nums);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
         sum+=nums[i];
       if(sum<=coins){
        count++;
       }else{
        return count;
       }
       }
         return count;
    }
}