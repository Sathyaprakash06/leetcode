class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=0;j<nums.length;j++){
                if(Math.abs(i-j)<=k&&nums[j]==key){
                    s=1;
                }
            }
            if(s==1){
                list.add(i);
            }
        }
        return list;
    }
}