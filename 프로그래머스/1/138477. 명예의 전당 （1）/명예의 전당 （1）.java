import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<score.length; i++){
            list.add(score[i]);
            list.sort(Comparator.naturalOrder());//리스트를 오름차순으로 변경
            if(list.size() > k) { //리스트를 반복하면서 만약 k보다 크다면 조건문
                list.remove(0); //k보다 list의 크기가 크면 첫번째(가장 작은) 점수 제거
            }
            answer[i] = list.get(0); //점수를 제거 후 list에 남아있는 가장 작은 점수를 i번쨰 answer배열에 삽입
        }
        return answer;
    }
}
