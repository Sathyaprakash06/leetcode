class Solution {
    public int[] sumEvenAfterQueries(int[] arr, int[][] queries) {
        int[]arr2=new int[queries.length];
        int ind=0;
       for(int i=0;i<queries.length;i++){
        int max=queries[i][0];
        int max1=queries[i][1];
       arr[max1]=max+arr[max1];
        arr2[ind++]=add(arr);
       }
       return arr2;
    }
    public static int add(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
            sum+=arr[i];}
        }
        return sum;
    }
}