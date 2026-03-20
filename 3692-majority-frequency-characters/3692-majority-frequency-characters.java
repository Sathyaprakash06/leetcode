class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashMap<Integer,Integer>map1=new HashMap<>();
        for(int i:map.values()){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        int max=Integer.MIN_VALUE;
        int val=0;
        for(int i:map.values()){
            if(map1.get(i)>max||(map1.get(i) == max && i > val)){
                max=map1.get(i);
                val=i;
            }
        }
        String s1="";
        for(char i:map.keySet()){
            if(val==map.get(i)){
                s1+=i;
            }
        }
        return  s1;

    }
}