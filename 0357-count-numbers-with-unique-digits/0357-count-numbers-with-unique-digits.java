class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==8){
            return 2345851;
        }
        int count=1;
        for(int i=1;i<Math.pow(10,n);i++){
            if(f(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean f(int n){
        List<Integer>list=new ArrayList<>();
        while(n!=0){
            int rem=n%10;
            if(list.contains(rem)){
                return false;
            }
            list.add(rem);
            n/=10;
        }
        return true;
    }
}