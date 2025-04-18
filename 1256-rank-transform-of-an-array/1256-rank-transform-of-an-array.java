class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int nums[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
            nums[i]=arr[i];

        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(arr);
        int j=0;
        for(int i:arr){
          if(!(map.containsKey(i))){
            j++;
            map.put(i,j);
          }
            
        }
        int arr2[]=new int[nums.length];
        int ind=0;
        for(int i=0;i<arr2.length;i++){
        arr2[ind++]=map.get(nums[i]);
        }
        return arr2;
    }
}