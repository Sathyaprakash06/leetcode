class Solution {
    public int firstUniqChar(String s) {
        int[]count=new int[128];
        for(char i:s.toCharArray())
        {
            count[i-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}