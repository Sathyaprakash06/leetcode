class Solution {
    public void rotate(int[][] matrix) {
        int[][]arr=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr[i][j]=matrix[i][j];
                }
                }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=arr[matrix.length-1-j][i];
            }
        }

    }
}