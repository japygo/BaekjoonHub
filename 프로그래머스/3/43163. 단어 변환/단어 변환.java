import java.util.Arrays;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        if (!Arrays.asList(words).contains(target)) {
            return answer;
        }
        int length = words.length;
        boolean[] visited = new boolean[length];
        answer = recur(0, begin, target, words, visited);
        return answer;
    }
    private int recur(int count, String word, String target, String[] words, boolean[] visited) {
        if (word.equals(target)) {
            return count;
        }
        if (count > words.length) {
            return Integer.MAX_VALUE;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (visited[i] || !isChange(word, words[i])) {
                continue;
            }
            visited[i] = true;
            result = Math.min(result, recur(count + 1, words[i], target, words, visited));
            visited[i] = false;
        }
        return result;
    }
    private boolean isChange(String word, String target) {
        boolean result = true;
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            char b = target.charAt(i);
            if (a != b) {
                count += 1;
            }
            if (count > 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}