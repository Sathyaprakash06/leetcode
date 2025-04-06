class Solution {
    public int climbStairs(int n) {
        if(n<2){
            return n;
        }
        int first=1;
        int sec=2;
        for(int i=2;i<n;i++){
            int next=first+sec;
            first=sec;
            sec=next;
        }
        return sec;
    }
}