class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char i:t.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char i:s.toCharArray()){
            if(map.containsKey(i)){
                map.put(i,map.get(i)-1);
            }}
      for(char i:map.keySet()){
        if(map.get(i)==1){
            return i;
        }
      }
        return 'u';
    }
}