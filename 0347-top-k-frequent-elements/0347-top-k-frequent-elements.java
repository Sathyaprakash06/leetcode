class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]arr=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ind=0;
        while(k!=0){
            int max=0;
            int val=0;
            for(int i:map.keySet()){
                if(map.get(i)>max){
                 max=map.get(i);
                    val=i;
                }
            }
            arr[ind++]=val;
            map.remove(val);
            k--;
        }
        return arr;
        }
}