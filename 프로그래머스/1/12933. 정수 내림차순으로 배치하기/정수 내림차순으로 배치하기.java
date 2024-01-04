import java.util.*;

class Solution {
    public long solution(long n) {
        String nString = String.valueOf(n);
        char[] nArr = nString.toCharArray();
        Arrays.sort(nArr);
        long answer = 0;
        
        String reverse = new StringBuilder(new String(nArr)).reverse().toString();
        
        answer = Long.parseLong(reverse);
        return answer;
    }
}