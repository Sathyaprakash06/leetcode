class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int []arr=new int[n];
        int ind=0;
        for(int i:heights)
        arr[ind++]=i;
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr[i])
            count++;
        }
        return count;
    }
}