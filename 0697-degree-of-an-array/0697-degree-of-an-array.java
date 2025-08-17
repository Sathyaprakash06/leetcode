class Solution {
    public int findShortestSubArray(int[] nums) {
        if(nums.length<2){
            return 1;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
         int max=Integer.MIN_VALUE;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>max){
                max=map.get(i);
            }
        }
        List<Integer> list=new ArrayList<>();
          for(int i:map.keySet()){
            if(map.get(i)==max){
                list.add(i);
            }
          }

        for(int ind=0;ind<list.size();ind++){
            int max1=list.get(ind);
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==max1){
                for(int j=nums.length-1;j>=0;j--){
                    if(nums[j]==max1){
                      int s=j-i+1;
                       list.set(ind,s);
                       break;
                    }
                
                }
                break;
            }
        }}
        return Collections.min(list);
    }
}