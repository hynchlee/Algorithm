class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0; // 결과값을 저장할 변수 초기화
        for(int i=1; i<=number; i++){ // 1부터 number까지 반복
            int cnt=0; // 약수 개수를 저장할 변수 초기화
            for(int j=1; j*j<=i; j++){ // 제곱근까지 반복
                if(j*j==i) cnt++; // 현재 수가 제곱 수인 경우 약수 개수를 1 증가
                else if(i%j==0) cnt += 2; // 약수가 발견될 때마다 약수 개수를 2 증가 (약수는 대칭적인 관계)
            }
            if(cnt>limit) cnt=power; // 약수 개수가 limit을 초과하면 cnt에 power 값을 대입
            answer += cnt; // cnt 값을 answer에 누적
        }
        return answer; // 최종 결과값 반환
    }
}