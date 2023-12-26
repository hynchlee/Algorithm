class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] myString = my_string.split("");
        for(int i=0; i<myString.length; i++){
            answer += myString[i].repeat(n);
        }
        return answer;
    }
}