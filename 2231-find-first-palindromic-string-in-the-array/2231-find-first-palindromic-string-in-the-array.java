class Solution {
    public String firstPalindrome(String[] words) {
        for(String y:words){
            StringBuilder res=new StringBuilder(y).reverse();
            if(y.equals(res.toString())){
                return y;
            }
        }
        return "";
    }
}