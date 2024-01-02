class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(n-array[0]);
        
        for(int i=0; i<array.length; i++){
            int dif = Math.abs(n-array[i]);
            if (dif < min || (dif == min && array[i] < answer)) {
                min = dif;
                answer = array[i];
            }
        }
        return answer;
    }
}