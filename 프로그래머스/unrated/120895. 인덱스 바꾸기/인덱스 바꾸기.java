class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();
        
        //my_string에 num1번째 문자를 가져와서 arr[num1]에 넣기
        arr[num1] = my_string.charAt(num2);
        arr[num2] = my_string.charAt(num1);
        
        //문자열로 변환
        String answer = String.valueOf(arr);
        
        return answer;
    }
}