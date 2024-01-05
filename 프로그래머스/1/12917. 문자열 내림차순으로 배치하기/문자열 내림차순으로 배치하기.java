import java.util.*;
import java.util.Collection;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        for(String x : str){
            answer += x;
        }
        return answer;
    }
}