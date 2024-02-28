import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger aB = new BigInteger(a);
        BigInteger bB = new BigInteger(b);
        BigInteger sum = aB.add(bB);
        answer = String.valueOf(sum);
        return answer;
    }
}