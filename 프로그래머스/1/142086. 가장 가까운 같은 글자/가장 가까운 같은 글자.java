class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] sArr = s.split("");
        for(int i=0; i<sArr.length; i++){
            answer[i] = -1;
            for(int j=i-1; j>=0; j--){
                if(sArr[i].equals(sArr[j])){
                    answer[i] = i-j;
                    break;
                }
            }
        }
        return answer;
    }
}