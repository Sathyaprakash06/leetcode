class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean>list=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            list.add(isArithmetic(Arrays.copyOfRange(nums,l[i],r[i]+1)));
        }
        return list;
    }
    public static boolean isArithmetic(int[]arr){
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=diff){
                return false;
            }
        }
        return true;
    }
}