class Solution {
    public int solution(int num, int k) {
        String numString = Integer.toString(num);
        String[] numArr = numString.split("");
        for(int i=0; i<numString.length(); i++){
            if(numArr[i].equals(Integer.toString(k))){
                return i+1;
            }
        }
        return -1;
    }
}