class Solution {
    public static int[] solution(int[] arr) {
    	int max = 0;
    	int min = 11;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] == 2) {
    			if(min == 11) {
    				min = i;
    			}
    			max = Math.max(max, i);
    		}
    	}
    	
    	if(min == 11) {
    		return new int[] {-1};
    	}
    	
    	int[] answer = new int[max-min+1];
    	for(int i=0; i<answer.length; i++) {
    		answer[i] = arr[min+i];
    	}
        return answer;
    }
}