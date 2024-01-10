import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        
        for(int i : list){
            int cnt = 2;
            answer++;
            while(i > cnt){
                if(i % cnt == 0){
                    answer--;
                    break;
                }
                cnt++;
            }
        }

        return answer;
    }
}