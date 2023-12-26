class Solution {
    public int solution(int n, int t) {
        int answer = n;
        int m = 0;
        while(m < t){
            answer *= 2;
            m++;
        }
        return answer;
    }
}