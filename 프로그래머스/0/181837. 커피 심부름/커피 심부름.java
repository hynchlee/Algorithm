class Solution {
    public static int solution(String[] order) {
    	int answer = 0;
    	for(String str : order) {
            if(str.contains("americano") || str.equals("anything")) {
            	answer += 4500;
            }else {
            	answer += 5000;
            }
        }
        return answer;
    }
}