class Solution {
    public String shortestPalindrome(String s) {
        int length=s.length();
        int left=0;
        int right=s.length()-1;
        for( right=s.length()-1;right>=0;right--){
            if(s.charAt(left)==s.charAt(right)){
                left++;
            }
        }
        if(left==length)
        return s;
        String s1=s.substring(left);
        StringBuilder res=new StringBuilder(s1).reverse();
        return res.append(shortestPalindrome(s.substring(0,left))).append(s1).toString();
    }
}