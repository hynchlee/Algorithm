class Solution {
    public int[] solution(long n) {
        String numString = String.valueOf(n); // 정수를 문자열로 변환
        int[] answer = new int[numString.length()]; // 결과 배열 생성

        for (int i = numString.length() - 1; i >= 0; i--) {
            answer[numString.length() - 1 - i] = Character.getNumericValue(numString.charAt(i));
            // 문자열을 뒤에서부터 순회하며 각 자리 숫자를 결과 배열에 저장
        }

        return answer;
    }
}
