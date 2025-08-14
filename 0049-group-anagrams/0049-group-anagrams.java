class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> map=new HashMap<>();
      for(String i:strs){
        String s=i;
        char[]ch=s.toCharArray();
        Arrays.sort(ch);
        String c=new String(ch);
        if(!map.containsKey(c)){
            map.put(c,new ArrayList<>());
        }
        map.get(c).add(i);
      } 
      return new ArrayList<>(map.values());
    }
}