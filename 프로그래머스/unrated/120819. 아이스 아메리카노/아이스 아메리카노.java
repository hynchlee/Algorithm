class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int a = money/5500;
        int b = money%5500;
        answer[0] = a;
        answer[1] = b;
        return answer;
    }
}

/*
class Solution {
    public int[] solution(int money) {
        return new int[]{money/5500, money%5500};
    }
}
*/