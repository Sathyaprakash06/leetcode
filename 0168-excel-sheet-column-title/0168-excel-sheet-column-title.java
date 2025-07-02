class Solution {
    public String convertToTitle(int n) {
        String s1 ="";
        StringBuilder res= new StringBuilder();
        while(n!=0){
            n--;
            int s=n%26;
             res.append((char)(s+'A'));
            n/=26;
        }
        return res.reverse().toString();
    }
}