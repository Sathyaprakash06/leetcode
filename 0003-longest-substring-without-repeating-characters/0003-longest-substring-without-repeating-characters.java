class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int max=0;
        int length=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                max=Math.max(max,map.get(c)+1);
            }
            map.put(c,i);
            length=Math.max(length,i-max+1);
        }
        return length;
    }
}