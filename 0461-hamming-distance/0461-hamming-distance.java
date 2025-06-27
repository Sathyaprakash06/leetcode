class Solution {
    public int hammingDistance(int x, int y) {
        int s=x^y;
        return Integer.bitCount(s);
    }
}