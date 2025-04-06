class Solution {
    public int[][] transpose(int[][] matrix) {
        int i,j;
        int [][]arr=new int[matrix[0].length][matrix.length];
        for(i=0;i<arr.length;i++){
           for(j=0;j<arr[i].length;j++){
arr[i][j]=matrix[j][i];
           }
        }
        return arr;
    }
}