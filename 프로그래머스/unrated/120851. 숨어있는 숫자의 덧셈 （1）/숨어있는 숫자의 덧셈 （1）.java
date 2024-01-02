// class Solution {
//     public int solution(String my_string) {
//         //[^0-9]는 숫자가 아닌 모든 문자를 없앤다.
//         my_string = my_string.replaceAll("[^0-9]", "");

//         int answer = 0;

//         for(int i=0; i<my_string.length(); i++) {
//             answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
//         }           

//         return answer;      
//     }
// }

class Solution {
    public int solution(String my_string) {
        //[^0-9]는 숫자가 아닌 모든 문자를 없앤다.
        String[] str = my_string.replaceAll("[^0-9]", "").split("");

        int answer = 0;

        for(int i=0; i<str.length; i++) {
            answer += Integer.parseInt(str[i]);
        }           

        return answer;      
    }
}