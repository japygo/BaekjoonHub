class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = Integer.MIN_VALUE;
        int maxH = Integer.MIN_VALUE;
        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];
            if (w < h) {
                w = size[1];
                h = size[0];
            }
            if (maxW < w) {
                maxW = w;
            }
            if (maxH < h) {
                maxH = h;
            }
        }
        answer = maxW * maxH;
        return answer;
    }
}