import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger s=new BigInteger(num1);
        BigInteger d=new BigInteger(num2);
         BigInteger p=s.multiply(d);
         return p.toString();
    }
}