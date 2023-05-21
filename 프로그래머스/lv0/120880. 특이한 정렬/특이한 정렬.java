import java.util.Arrays;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        Integer[] arr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (a, b) -> {
            if (Math.abs(a - n) == Math.abs(b - n)) {
                return b - a;
            }
            return Math.abs(a - n) - Math.abs(b - n);
        });
        answer = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}