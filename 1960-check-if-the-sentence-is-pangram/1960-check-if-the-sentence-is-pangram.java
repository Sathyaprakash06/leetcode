class Solution {
    public boolean checkIfPangram(String sentence) {
        String s=sentence.toLowerCase();
        if(s.length()<26)
        return false;
        for(char i='a';i<='z';i++){
            if(s.indexOf(i)<0)
            return false;
        }
        return true;
    }
}