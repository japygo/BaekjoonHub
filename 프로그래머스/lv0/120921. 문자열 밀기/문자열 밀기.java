class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int length = A.length();
        for (int i = 0; i < length; i++) {
            if (A.equals(B)) {
                break;
            }
            answer++;
            A = A.substring(length - 1, length) + A.substring(0, length - 1);
        }
        if (answer == length) {
            answer = -1;
        }
        return answer;
    }
}