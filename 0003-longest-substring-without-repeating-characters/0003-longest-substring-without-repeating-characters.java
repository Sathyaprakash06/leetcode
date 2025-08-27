 class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap<Character,Integer>map=new HashMap<>();
      int max=0;
      int length=0;
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(map.containsKey(ch)){
            max=Math.max(max,map.get(ch)+1);
        }
        map.put(ch,i);
        length=Math.max(length,i-max+1);
      }
      return length;
     }
}


