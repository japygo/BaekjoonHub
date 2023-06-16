import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        int[] nums = new int[t];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            nums[i] = n;
            if (n > max) {
                max = n;
            }
        }

        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 2; i <= max; i++) {
            map.put(i, true);
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (map.get(i)) {
                primes.add(i);
                for (int j = i + i; j <= max; j += i) {
                    map.put(j, false);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int num : nums) {
            int cnt = 0;
            for (int prime : primes) {
                if (prime <= num - prime && map.get(num - prime)) {
                    cnt++;
                }
            }
            result.append(cnt).append("\n");
        }
        System.out.print(result);
    }
}