class Solution {
    public String replaceDigits(String s) {
        char[]ch=s.toCharArray();
       for(int i=1;i<ch.length;i++){
        if(Character.isDigit(ch[i])){
            ch[i]=(char)(ch[i-1]+Integer.parseInt(String.valueOf(ch[i])));
        }
       }
       return new String(ch);
    }
}