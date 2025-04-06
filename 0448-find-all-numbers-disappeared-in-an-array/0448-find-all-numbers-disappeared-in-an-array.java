class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        int miss[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            miss[nums[i]]++;
        }
        for(int i=1;i<miss.length;i++){
            if(miss[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}