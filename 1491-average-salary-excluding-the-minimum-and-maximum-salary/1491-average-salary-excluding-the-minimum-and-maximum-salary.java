class Solution {
    public double average(int[] salary) {
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int i:salary){
        min=Math.min(min,i);
        max=Math.max(max,i);
       }
       double sum=0;
       int c=0;
       for(int i:salary){
        if(min!=i&&max!=i){
            sum+=(double)i;
            c++;
        }
       }
       return (double)(sum/c);
    }
}