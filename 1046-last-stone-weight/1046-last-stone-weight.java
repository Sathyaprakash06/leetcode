class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
      while(n!=1){
        int[]arr=new int[n-1];
        Arrays.sort(stones);
        for(int i=0;i<n;i++){
            if(i<n-1){
                arr[i]=stones[i];
            }
        }
          if(stones[n-1]!=stones[n-2]){
                arr[n-2]=stones[n-1]-stones[n-2];
            }
            if(stones[n-1]==stones[n-2]){
                arr[n-2]=0;
               
            }
        System.out.print(Arrays.toString(arr));
        stones=arr;
        n--;
      }
      return stones[0];
    }
}