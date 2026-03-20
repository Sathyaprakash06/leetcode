class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int[]arr=new int[nums.length];
        List<Integer>list=new ArrayList<>();
        for(int i:nums){
            if(i>=0)
            list.add(i);
        }
     
        Collections.rotate(list,-k);
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                arr[i]=list.get(ind++);
            }else{
                arr[i]=nums[i];
            }
        }
        return arr;
    }
}