class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        map.put(i,map.getOrDefault(i,0)+1);
        int max=0;
        for(int i:nums){
            if(map.containsKey(i+1)){
                int total=map.get(i)+map.get(i+1);
                max=Math.max(max,total);
            }
        }
        return max;
    }
}