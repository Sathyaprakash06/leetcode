class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        int sum1=0;
        int r=0;
        for(int i=1;i<=n;i++){
            if(sum1==sum-sum1-i){
                return i;
            }
            else{
                sum1+=i;
            }
        }
        return -1;
    }
}