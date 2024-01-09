class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes"; // 결과를 저장할 변수 초기화
        int idx1 = 0; // cards1 배열의 인덱스
        int idx2 = 0; // cards2 배열의 인덱스
        
        for (int i = 0; i < goal.length; i++) { // goal 배열 순회
            if (idx1 < cards1.length && goal[i].equals(cards1[idx1])) { 
                // 현재 goal 요소와 cards1[idx1]이 동일한지 확인
                idx1++; // cards1[idx1]과 동일하면 idx1 증가
            } else if (idx2 < cards2.length && goal[i].equals(cards2[idx2])) { 
                // 현재 goal 요소와 cards1[idx1]이 동일하지 않고, cards2[idx2]와 동일한지 확인
                idx2++; // cards2[idx2]과 동일하면 idx2 증가
            } else {
                answer = "No"; // 현재 goal 요소가 cards1[idx1]과도 cards2[idx2]와도 동일하지 않음
            }
        }
        return answer;
    }
}