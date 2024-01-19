import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        char lastChar = words[0].charAt(0);
        for(int i=0; i<words.length; i++){
            list.add(words[i]);
            if(words[i].charAt(0) != lastChar || list.subList(0, i).contains(words[i])) {
            	answer[0] = (i%n) +1;
            	answer[1] = (i/n) +1;
            	break;
            }
            lastChar = words[i].charAt(words[i].length()-1);
        }
        return answer;
    }
}