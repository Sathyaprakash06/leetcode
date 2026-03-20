class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[]arr=new int[nums.length];
      for(int i=0;i<nums.length;i++){
        HashSet<Integer>set=new HashSet<>();
      HashSet<Integer>set1=new HashSet<>();
        for(int j1=0;j1<=i;j1++){
            set1.add(nums[j1]);
        }
        for(int j=i+1;j<nums.length;j++){
            set.add(nums[j]);
        }
        arr[i]=set1.size()-set.size();
      }
      return arr;
    }
}