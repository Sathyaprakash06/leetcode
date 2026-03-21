class Solution {
    public int largestInteger(int num) {
        String s=String.valueOf(num);
        int[]arr=new int[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        List<String>list=new ArrayList<>();
        
       for(int i=0;i<arr.length;i++){
 String s1="";
        for(int j=i+1;j<arr.length;j++){

            if(arr[j]%2==0&&arr[i]%2==0&&arr[j]>arr[i]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
      
       }
         for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]%2!=0&&arr[i]%2!=0&&arr[j]>arr[i]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
             
        }}


      String s1="";
      
      for(int i:arr){
        
            s1+=String.valueOf(i);
        
      }
     
        return Integer.parseInt(s1);
    }
}