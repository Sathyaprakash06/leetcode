class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr1=(25*arr.length)/100;
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=Integer.MIN_VALUE;
        
        for(int i:arr){
            if(map.get(i)>arr1)
            return i;
            
        }
        return -1;
    }
}