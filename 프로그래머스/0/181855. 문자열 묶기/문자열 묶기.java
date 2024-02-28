import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(String str : strArr){
            int len = str.length();
            map.put(len, map.getOrDefault(len, 0) + 1);
        }
        
        for(int count : map.values()){
            answer = Math.max(count, answer);
        }
        return answer;
    }
}