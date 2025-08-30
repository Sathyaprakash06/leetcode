class Solution {
    public String mostCommonWord(String p, String[] b) {
       String s1=p.replaceAll("[^a-zA-Z\\s]", " ").toLowerCase();
       String []s2=s1.split("\\s+");
       String s="";
        HashMap<String,Integer>map=new HashMap<>();
        Set<String>set=new HashSet<>(Arrays.asList(b));
        for(String i:s2){
            if(!set.contains(i)&&!i.isEmpty())
        map.put(i,map.getOrDefault(i,0)+1);}
        
        int max=Integer.MIN_VALUE;
        for(String i:map.keySet()){
            if(max<map.get(i)){
                max=map.get(i);
                s=i;
            }
        }
    
        return s;
        
    }
}