class Solution {
    public int minChanges(int n, int k) {
        if((n&k)!=k){
            return -1;
        }
        String s=Integer.toBinaryString(n);
        String s1=Integer.toBinaryString(k);
    
        int res=0;
        for(char i:s.toCharArray()){
            res+=i-'0';
        }
        for(char i:s1.toCharArray()){
            res-=i-'0';
        }
        return res;
    }
}