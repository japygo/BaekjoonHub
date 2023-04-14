class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int length = array.length;
        if (1 <= n && n <= 100
           && 1<= length && length <= 100) {
            int min = 0;
            answer = 1000;
            for (int i = 0; i < length ; i++) {
                int num = array[i];
                min = Math.abs(n - num);
                if (min < Math.abs(n - answer)) {
                    answer = num;
                } else if (min == Math.abs(n - answer)) {
                    if (num < answer) {
                        answer = num;
                    }
                }
            }
        }
        return answer;
    }
}