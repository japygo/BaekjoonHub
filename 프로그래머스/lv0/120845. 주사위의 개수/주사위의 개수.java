class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int length = box.length;
        if (length == 3 && 1 <= n && n <= 50) {
            int a = (int) box[0] / n;
            int b = (int) box[1] / n;
            int c = (int) box[2] / n;
            answer = a * b * c;
        }
        return answer;
    }
}