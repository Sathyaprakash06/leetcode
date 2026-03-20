class Solution {
    public boolean canBeIncreasing(int[] nums) {
   
       
        if(nums.length<=2){
            return true;
        }
        for(int i=0;i<nums.length;i++){
            
            List<Integer>list=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((j != i)){
                   list.add(nums[j]);
                }
            }
           int c=0;
           for(int i1=0;i1<list.size()-1;i1++){
            if(list.get(i1)<list.get(i1+1)){
                c++;
            }
           }
           if(c==list.size()-1){
            return true;
           }
        }
        return false;
    }
}