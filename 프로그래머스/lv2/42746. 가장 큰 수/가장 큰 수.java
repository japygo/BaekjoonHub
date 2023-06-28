import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        boolean isZero = true;
        for (int number : numbers) {
            if (number != 0) {
                isZero = false;
                break;
            }
        }
        if (isZero) {
            return "0";
        }
        sort(numbers, 0, numbers.length - 1);
        answer = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining());
        return answer;
    }

    public void sort(int[] n, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        sort(n, left, mid);
        sort(n, mid + 1, right);
        merge(n, left, mid, right);
    }

    public void merge(int[] n, int left, int mid, int right) {
        int[] sorted = new int[n.length];
        int l = left;
        int r = mid + 1;
        int index = left;

        while (l <= mid && r <= right) {
            int a = n[l];
            int b = n[r];
            if (Integer.parseInt(a + "" + b) >= Integer.parseInt(b + "" + a)) {
                sorted[index++] = n[l++];
            } else {
                sorted[index++] = n[r++];
            }
        }

        if (l > mid) {
            while (r <= right) {
                sorted[index++] = n[r++];
            }
        } else {
            while (l <= mid) {
                sorted[index++] = n[l++];
            }
        }

        for (int i = left; i <= right; i++) {
            n[i] = sorted[i];
        }
    }
}