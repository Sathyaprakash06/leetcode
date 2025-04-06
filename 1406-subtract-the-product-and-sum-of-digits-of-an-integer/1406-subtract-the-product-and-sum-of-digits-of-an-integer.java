class Solution {
    public int subtractProductAndSum(int n) {
        int s=n;
        int s1=0;
        int s2=1;
        while(s!=0){
            int dig=s%10;
            s1+=dig;
            s2*=dig;
            s/=10;
        }
        return s2-s1;
    }
}