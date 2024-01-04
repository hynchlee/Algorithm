class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        String a = phone_number.substring(0, len-4).replaceAll("[0-9]","*");
        String b = phone_number.substring(len-4, len);
        
        answer = a+b;
        return answer;
    }
}