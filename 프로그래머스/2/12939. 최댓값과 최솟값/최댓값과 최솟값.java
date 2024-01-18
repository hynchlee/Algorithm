class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        int[] numbers = new int[sArr.length];
        
        for (int i = 0; i < sArr.length; i++) {
            numbers[i] = Integer.parseInt(sArr[i]);
        }
        int mx = numbers[0];
        int mn = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(mx < numbers[i]){
                mx = numbers[i];
            }
            if(mn > numbers[i]){
                mn = numbers[i];
            }
        }
        answer = String.valueOf(mn) + " " + String.valueOf(mx);
        return answer;
    }
}