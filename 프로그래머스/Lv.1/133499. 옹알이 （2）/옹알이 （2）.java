class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bArr = {"aya", "ye", "woo", "ma"};
        String[] reArr = {"ayaaya", "yeye", "woowoo", "mama"};
        for(int i=0; i<babbling.length; i++) {
        	for(int j=0; j<bArr.length; j++) {
        		babbling[i] = babbling[i].replaceAll(reArr[j], "1").replaceAll(bArr[j], " ");
        	}
        	
        	if(babbling[i].trim().length() == 0) {
        		answer++;
        	}
        }
        return answer;
    }
}