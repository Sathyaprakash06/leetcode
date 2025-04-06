class Solution {
    public boolean isPalindrome(int x) {
      String n=String.valueOf(x);
      StringBuilder res=new StringBuilder(n).reverse();
      if(n.equals(res.toString())){
        return true;
      }
      return false;
    }
}