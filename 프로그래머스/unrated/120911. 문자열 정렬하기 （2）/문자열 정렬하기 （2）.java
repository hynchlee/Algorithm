import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String ms = my_string.toLowerCase();

        char[] msArr = ms.toCharArray();
        Arrays.sort(msArr);
        answer = new String(msArr);
        return answer;
    }
}

// class Solution {
//     public String solution(String my_string) {
//         String answer = "";
//         char[] myChar = my_string.toLowerCase().toCharArray();
//         Arrays.sort(myChar);
//         answer = new String(myChar);
//         return answer;
//     }
// }