class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        StringBuilder res=new StringBuilder(s).reverse();
        String s1=res.toString();
        int[]arr=new int[n+1];
         int[]arr1=new int[n+1];
        int max=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==s1.charAt(j-1)){
                    arr[j]=1+arr1[j-1];
                }else{
                    arr[j]=Math.max(arr1[j],arr[j-1]);
                }
            }
            arr1=arr.clone();
        }   
        return arr1[n];
    }
}