class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;
       for(int i:nums ){
        sum+=i;
        while(i!=0){
            digit+=i%10;
            i/=10;
        }
       }
       return sum-digit;
    }
}