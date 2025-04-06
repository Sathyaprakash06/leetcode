class Solution {
    public boolean detectCapitalUse(String word) {
       String st=word.substring(0,1);
       String end=word.substring(1);
       if(word.equals(word.toUpperCase())||word.equals(word.toLowerCase())){
        return true;
       }
        if(st.equals(st.toUpperCase())&&end.equals(end.toLowerCase())){
            return true;}
            return false;
    }
}