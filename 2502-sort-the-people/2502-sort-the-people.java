class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[]arr=new String[heights.length];
        int ind=0;
        for(int i=arr.length-1;i>=0;i--){
            arr[ind++]=map.get(heights[i]);
        }
        return arr;
    }
}