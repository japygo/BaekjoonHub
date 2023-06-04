import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Integer[] nArr = Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        Set<Integer> set = new HashSet<>(Arrays.asList(nArr));

        int m = Integer.parseInt(bufferedReader.readLine());
        int[] mArr = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (set.contains(mArr[i])) {
                stringBuilder.append(1);
            } else {
                stringBuilder.append(0);
            }
            if (i < m - 1) {
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder);
    }
}