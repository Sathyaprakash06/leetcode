class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
        int s=arr[i]-arr[i-1];
        min=Math.min(min,s);
        }
        List<List<Integer>> li=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
             ArrayList<Integer> li1=new ArrayList<>(); 
            if(arr[i]-arr[i-1]==min){
            li1.add(arr[i-1]);
            li1.add(arr[i]);
            li.add(li1);}
        }
        return li;
    }
}