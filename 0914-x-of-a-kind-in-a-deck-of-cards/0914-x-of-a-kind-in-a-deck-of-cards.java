class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

       HashMap<Integer,Integer>map =new HashMap<>();
       for(int i:deck)
       map.put(i,map.getOrDefault(i,0)+1);
     int c=0;
     for(int i:map.values()){
        c=gcd(c,i);
     }
     return c>1;
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}