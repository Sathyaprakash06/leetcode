class Solution {
    public int countPrimeSetBits(int left, int right) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            list.add(Integer.bitCount(i));
        }
        System.out.print(list);
        int count=0;
        for(int i:list){
            if(prime(i)){
                count++;
            }
        }
    return count;
    }
     public boolean prime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}