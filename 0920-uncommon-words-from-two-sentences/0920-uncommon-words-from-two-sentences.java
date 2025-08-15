class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list=new ArrayList<>();
        String[]words=s2.split(" ");
         String[]words1=s1.split(" ");
         HashMap<String,Integer> map=new HashMap<>();
         for(String i:words){
            map.put(i,map.getOrDefault(i,0)+1);
         }
         for(String i:words1){
            map.put(i,map.getOrDefault(i,0)+1);
         }
         for(String i:map.keySet()){
            if(map.get(i)==1){
                list.add(i);
            }
         }
         System.out.print(list);
         return list.toArray(new String[0]);
    }
}