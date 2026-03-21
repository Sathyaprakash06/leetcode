class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
    int st = 0;
    int end = k - 1;

    while (st < end) {
        for (int i = 0; i < k; i++) {
            int temp = grid[x + st][y + i];
            grid[x + st][y + i] = grid[x + end][y + i];
            grid[x + end][y + i] = temp;
        }
        st++;
        end--;
    }

    return grid;
}}