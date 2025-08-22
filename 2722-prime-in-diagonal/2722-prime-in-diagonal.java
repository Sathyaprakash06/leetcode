class Solution {
    public int diagonalPrime(int[][] nums) {
        int max=0;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int n=nums[i][i];
            int n1=nums[i][nums.length-i-1];
            if(prime(n)){
                max=Math.max(max,n);
            }
            if(prime(n1)){
                max=Math.max(max,n1);
            }
        }
        
        return max;
    }
    public static boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}