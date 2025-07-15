class Solution {
    public int splitNum(int n) {
        String s =String.valueOf(n);
        char[]ch=s.toCharArray();
        Arrays.sort(ch);
        String s1="";
        for(int i=0;i<ch.length;i+=2)
        s1+=ch[i];
         String s2="";
        for(int i=1;i<ch.length;i+=2)
        s2+=ch[i];
        return Integer.parseInt(s1)+Integer.parseInt(s2);
    }
}