class Solution {
    public int[][] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[][] answer = new int[length / n][];
        if (length >= 0 && length <= 150
           && n >= 2 && n < length
           && length % n == 0) {
            for (int i = 0 ; i < length / n ; i++) {
                answer[i] = new int[n];
                for (int j = 0 ; j < n ; j++) {
                    answer[i][j] = num_list[i * n + j];
                }
            }
        }
        return answer;
    }
}