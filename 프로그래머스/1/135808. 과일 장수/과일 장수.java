import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score); // 점수 배열을 오름차순으로 정렬
        
        for (int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m; // 선택한 점수와 간격(m)을 곱하여 누적
        }
        
        return answer;
    }
}
