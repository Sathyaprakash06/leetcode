class Solution {
    public int numJewelsInStones(String j, String s) {
       ArrayList<Character>list=new ArrayList<>();
       for(char c:s.toCharArray()){
        list.add(c);
       }
       int count=0;
       for(char i:j.toCharArray()){
        for(char stones:list)
        if(stones==i)
        count++;
       }
       return count;
    }
}