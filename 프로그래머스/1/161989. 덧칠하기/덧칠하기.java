class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1; // 최소 구간 개수를 저장할 변수 초기화
        int cnt = section[0]; // 현재까지 커버한 구간의 마지막 값
        for(int i=1; i<section.length; i++){ // 배열 section을 반복하면서 구간을 커버
            if(cnt+m-1 < section[i]){ // 현재 구간을 커버하지 못하는 경우
                answer++; // 구간 개수를 1 증가
                cnt = section[i]; // 다음 구간의 시작 값으로 갱신
            }
        }
        return answer; // 최소 구간 개수 반환
    }
}
