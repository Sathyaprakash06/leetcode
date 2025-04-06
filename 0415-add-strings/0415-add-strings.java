import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
     BigInteger s=new BigInteger(num1);
     BigInteger s1=new BigInteger(num2);
     BigInteger n=s.add(s1);
     return String.valueOf(n);

    }
}