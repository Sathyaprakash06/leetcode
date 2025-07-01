class Solution {
    public int trap(int[] h) {
        int l=0;
        int r=h.length-1;
        int lhs=h[l];
        int rhs=h[r];
        int res=0;
        while(l<=r){
            if(lhs<rhs){
                if(lhs<h[l])
                lhs=h[l];
            else 
                res+=lhs-h[l];
                l++;
            }
            else{
                if(rhs<h[r])
                rhs=h[r];
                else
                res+=rhs-h[r];r--;
            }
        }
        return res;
    }
}