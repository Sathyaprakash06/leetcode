class Solution {
    public int[] sumZero(int n) {
        int s=n;
        int[]re=new int[n];
        re[0]=s*(1-s)/2;
        for(int i=1;i<n;i++){
            re[i]=i;
        }
        return re;
    }
}