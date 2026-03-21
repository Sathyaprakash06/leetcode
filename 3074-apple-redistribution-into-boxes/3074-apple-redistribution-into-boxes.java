class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i:apple){
            sum+=i;
        }
        Arrays.sort(capacity);
        int n=capacity.length-1;
        int c=0;
        while(sum>0)
        {
            sum-=capacity[n--];
            c++;
            
        }
        return c;
    }
}