import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = bufferedReader.readLine();
        }
        Arrays.stream(arr).sorted((o1, o2) -> {
            int num1 = Integer.parseInt(o1.split(" ")[0]);
            int num2 = Integer.parseInt(o2.split(" ")[0]);
            if (num1 != num2) {
                return num1 - num2;
            }
            return 0;
        }).forEach(System.out::println);
    }
}