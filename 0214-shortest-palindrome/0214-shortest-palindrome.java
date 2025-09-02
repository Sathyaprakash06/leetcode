class Solution {
    public String shortestPalindrome(String s) {
       int length=s.length();
       int left=0;
       for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)==s.charAt(left)){
            left++;
        }
       }
       if(left==length){
        return s;
       }
       String s1=s.substring(left);
       StringBuilder res=new StringBuilder(s1).reverse();
       return res.append(shortestPalindrome(s.substring(0,left))).append(s1).toString();
    }
}