class Solution {
    public int prefixCount(String[] words, String pf) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pf))
            count++;
        }
        return count;
    }
}