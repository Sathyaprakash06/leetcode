class Solution {
    public char kthCharacter(int k) {
        int n=Integer.bitCount(k-1);
        return (char)(n+'a');
    }
}