class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int s=nums[i];
            if(map.containsKey(s)&&i-map.get(s)<=k){
                return true;
            }
            else{
                map.put(s,i);
            }
        }
        return false;
    }
}