class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int count[]=new int[max+1];
       for(int i=0;i<nums.length;i++){
        count[nums[i]]++;
       }
       for(int freq=0;freq<count.length;freq++){
        if(count[freq]==2){
            list.add(freq);
        }
       }
       return list;
    }
}