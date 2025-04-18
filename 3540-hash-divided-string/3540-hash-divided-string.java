class Solution {
    public String stringHash(String s, int k) {
        String s1="abcdefghijklmnopqrstuvwxyz";
        String res="";

       for(int i=0;i<s.length();i+=k){
        int sum=0;
        for(int j=i;j<k+i;j++){
            sum+=s1.indexOf(s.charAt(j));
        }
        sum=sum%26;
        res+=s1.charAt(sum);
       }
       return res;
    }
}