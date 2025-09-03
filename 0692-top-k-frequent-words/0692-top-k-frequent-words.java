class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(String i:words){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        LinkedList<String> list = new LinkedList<>();

while (k != 0 && !map.isEmpty()) {
    int max = 0;
    String val = "";

    for (String i : map.keySet()) {
        if (max<map.get(i)|| (map.get(i) == max && i.compareTo(val) < 0)) {
            max = map.get(i);
            val = i;
        }
    }

    list.add(val); 
    map.remove(val); 
    k--;
}

return list;
    }}