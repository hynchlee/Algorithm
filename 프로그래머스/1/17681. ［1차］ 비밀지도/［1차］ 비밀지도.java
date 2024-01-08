class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            String ans = Integer.toBinaryString(arr1[i] | arr2[i]);
            ans = ans.replaceAll("1", "#");
            ans = ans.replaceAll("0", " ");
            answer[i] = ans;
            while(answer[i].length() < n){
                answer[i] = " " + answer[i];
            }
        }
        return answer;
    }
}