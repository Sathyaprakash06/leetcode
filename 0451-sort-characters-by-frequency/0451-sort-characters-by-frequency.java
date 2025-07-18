class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        ArrayList<Character>list=new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        String sr="";
        for(char ch:list){
            int fre=map.get(ch);
            for(int i=0;i<fre;i++)
            sr+=ch;
        }
        return sr;
    }
}