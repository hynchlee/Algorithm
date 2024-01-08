class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int mmax = 0;
        for(int i=0; i<sizes.length; i++){
            int maxH = Math.max(sizes[i][0], sizes[i][1]);
            int maxV = Math.min(sizes[i][0], sizes[i][1]);
            max = Math.max(max, maxH);
            mmax = Math.max(mmax, maxV);
        }
        return max*mmax;
    }
}