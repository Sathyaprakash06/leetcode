class Solution {
    public int[] searchRange(int[] nums, int target) {
        int count=0;
        int[]mat=new int[2];
int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
                }
                if(count==0){
                    for(int i=0;i<2;i++)
                        mat[i]=-1;
                 } else{
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==target){
                    max=i;
                    break;}
                }
for(int i=0;i<2;i++){
    if(i==0) mat[i]=max;
    else mat[i]=max+count-1;
}
                     }    return mat;
    }
}