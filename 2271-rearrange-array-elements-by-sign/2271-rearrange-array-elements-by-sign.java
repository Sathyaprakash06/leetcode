class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i:nums){
            if(i>0){
                list.add(i);
            }else{
                list1.add(i);
            }
        }
        int[]arr=new int[nums.length];
        int g=0;
        for(int i=0;i<list.size();i++){
            arr[g++]=list.get(i);
            arr[g++]=list1.get(i);
        }
        return arr;
    }
}