class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        char[]ch=s2.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                if(s1.equals(new String(ch))){
                    return true;
                }
                char temp1=ch[j];
                ch[j]=ch[i];
                ch[i]=temp1;
            }
        }
        return false;
    }
}