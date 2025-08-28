class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(pal(i))
            list.add(i);
        }
        Collections.sort(list);
        System.out.print(list);
        int arr[]=new int[2];
        if(list.size()<2){
            arr[0]=-1; arr[1]=-1;
        }
        else{
        int min=Integer.MAX_VALUE;
       for(int i=0;i<list.size()-1;i++){
        min=Math.min(min,list.get(i+1)-list.get(i));
       }
       for(int i=0;i<list.size()-1;i++){
        if(list.get(i+1)-list.get(i)==min){
        arr[0]=list.get(i);
        arr[1]=list.get(i+1);
        break;}
       }}
       return arr;
    }
      public static boolean pal(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
}}