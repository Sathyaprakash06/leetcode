class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            if(freq.get(nums[i])>1){
                return nums[i];
            }
        }
        return -1;
    }
}