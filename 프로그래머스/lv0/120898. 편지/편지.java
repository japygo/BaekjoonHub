class Solution {
    public int solution(String message) {
        int answer = 0;
        int length = message.length();
        if (1 <= length && length <= 50) {
            answer = length * 2;
        }
        return answer;
    }
}