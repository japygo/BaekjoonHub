import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] a = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(a);
        int m = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            int start = 0;
            int end = n - 1;
            boolean isFind = false;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (a[mid] < num) {
                    start = mid + 1;
                } else if (a[mid] > num) {
                    end = mid - 1;
                } else {
                    isFind = true;
                    break;
                }
            }
            if (isFind) {
                result.append(1);
            } else {
                result.append(0);
            }
            if (i < m - 1) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}