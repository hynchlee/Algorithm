class Solution {
    public int solution(String s) {
        int answer = 0;
        String regex = "[^a-zA-Z0-9가-힣ㄱ-ㅎㅏ-ㅣ\\s]";
        String str = s.replaceAll("regex", "");
        answer = Integer.parseInt(str);
        return answer;
    }
}