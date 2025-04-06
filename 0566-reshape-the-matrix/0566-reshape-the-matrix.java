class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int m=mat.length;
       int n=mat[0].length;
       int[]arr=new int[m*n];
       int s=0;
       if(r*c!=m*n)
       return mat;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[s++]=mat[i][j];
        }
       }
       int[][]res=new int[r][c];
       s=0;
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            res[i][j]=arr[s++];
        }
       }
       return res;
    }
}