class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
        for(char i:word.toCharArray()){
            if(Character.isLowerCase(i)){
                set1.add(i);
             } else{
            set2.add(i);}
        }
        int count=0;
        for(char i:set1){
            if(set2.contains(Character.toUpperCase(i))){
            count++;
        }}
        return count;
    }
}