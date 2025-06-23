class Solution {
    public String getHint(String s, String g) {
   HashMap<Character,Integer> map=new HashMap<>();
   for(char i:s.toCharArray()){
    map.put(i,map.getOrDefault(i,0)+1);
   }
   int count=0;
   for(char i:g.toCharArray()){
    if(map.containsKey(i)&&map.get(i)!=0){
        map.put(i,map.get(i)-1);
        count++;
    }
    
   }
   int count1=0;
   for(int i=0;i<g.length();i++){
    if(s.charAt(i)==g.charAt(i)){
        count1++;
    }
   }
   int c=count-count1;
   String s1=count1+"A"+c+"B";
   return s1;
    }
}