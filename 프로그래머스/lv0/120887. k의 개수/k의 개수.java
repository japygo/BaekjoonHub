class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int n = i; n <= j; n++) {
            for (String s : String.valueOf(n).split("")) {
                if (Integer.parseInt(s) == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}