import java.util.*;

class Solution {
    // public String[] solution(String myStr) {
    //     ArrayList<String> list = new ArrayList<>();
    //     StringBuilder sb = new StringBuilder();
    //     for(char c : myStr.toCharArray()){
    //         if(c=='a'||c=='b'||c=='c'){
    //             if(sb.length() != 0){
    //                 list.add(sb.toString());
    //                 sb.setLength(0);
    //                 //sb = new StringBuilder();
    //             }
    //         }else{
    //             sb.append(c);
    //         }
    //     }
    //     if(sb.length() > 0){
    //         list.add(sb.toString());
    //     }
    //     if(sb.length() == 0){
    //         return new String[] {"EMPTY"};
    //     }else{
    //         return list.toArray(new String[0]);
    //     }
    // }
    public static String[] solution(String myStr) {
    	String trim = myStr.trim();
        String str = trim.replaceAll("[abc]+", " ");
        String[] split = str.split("\\s+");

        ArrayList<String> result = new ArrayList<String>();
        for (String s : split) {
			if(!s.isEmpty()) {
				result.add(s);
			}
		}
        
        if (result.isEmpty()) {
            return new String[] {"EMPTY"};
        } else {
            return result.toArray(new String[0]);
        }
    }
}