class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[]wo=sentence.split(" ");
        for(int i=0;i<wo.length;i++){
            if(wo[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}