import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int[] count = new int[10001];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i < 10001; i++) {
            count[i] += count[i - 1];
        }

        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            result[--count[arr[i]]] = arr[i];
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(result[i]);
            if (i < n - 1) {
                stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}