class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int st=0;
        int end=piles.length-1;
        int coins=0;
        while(st<end){
            end--;
            coins+=piles[end];
            end--;
            st++;

        }
        return coins;
    }
}