class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char i:s.toCharArray()){
                map.put(i,map.getOrDefault(i,0)+1);
        }
        int max1=0;
        int max2=0;
            for(char i:s.toCharArray()){
               if("AEIOUaeiou".indexOf(i)!=-1){
                  max1=Math.max(max1,map.get(i));
               }
               else{
                 max2=Math.max(max2,map.get(i));
               }
            }
            return max1+max2;
    }
}