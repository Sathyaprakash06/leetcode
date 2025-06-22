class Solution {
    public int findPermutationDifference(String s, String t) {
        int max=0;
        for(int i=0;i<s.length();i++){
            max+=Math.abs(i-t.indexOf(s.charAt(i)));
        }
        return max;
    }
}