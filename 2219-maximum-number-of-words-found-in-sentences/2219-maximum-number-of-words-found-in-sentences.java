class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        int count=0;
        for(String i:s){
            int va=i.split(" ").length;
            if(max<va){
                max=va;
            }
        }
        return max;
    }
}