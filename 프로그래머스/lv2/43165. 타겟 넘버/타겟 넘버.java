class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(0, numbers, target, 0);
        return answer;
    }

    private int dfs(int n, int[] numbers, int target, int sum) {
        if (n == numbers.length) {
            if (target == sum) {
                return 1;
            }
            return 0;
        }

        int cnt = 0;
        cnt += dfs(n + 1, numbers, target, sum + numbers[n]);
        cnt += dfs(n + 1, numbers, target, sum - numbers[n]);

        return cnt;
    }
}