class Solution {
    public String reverseWords(String s) {
        String[]res1=s.trim().split(" ");
         StringBuilder res=new StringBuilder();
        for(String i:res1){
            StringBuilder res2=new StringBuilder(i).reverse();
            res.append(res2).append(" ");
        }
        res.deleteCharAt(res.length()-1);
       return res.toString(); 
    }
}