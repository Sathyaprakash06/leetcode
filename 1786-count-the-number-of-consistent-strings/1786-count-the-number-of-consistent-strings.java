class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> list=new HashSet<>();
        for(char i:allowed.toCharArray())
        list.add(i);
        int count=0;
        for(String w:words){
            boolean flag=true;
            for(char i:w.toCharArray()){
                if(!list.contains(i)){
                flag=false;
                break;}
            }
            if(flag==true){
            count++;}
        }
        return count;
    }
}