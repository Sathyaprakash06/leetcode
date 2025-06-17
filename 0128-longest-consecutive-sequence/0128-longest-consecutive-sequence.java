class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:nums){
            set.add(i);
        }
        if(set.size()==0){
            return 0;
        }
        int n=nums.length;
        int[]arr=new int[set.size()];
        int k=0;
        for(int i:set){
            arr[k++]=i;
        }
        int count=1;
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
            count++;}
            else{
            max=Math.max(max,count);
            count=1;}
        }
max=Math.max(max,count);
return max;

    }
}