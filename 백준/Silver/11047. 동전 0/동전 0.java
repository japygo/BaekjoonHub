import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] <= k) {
                cnt += k / a[i];
                k = k % a[i];
            }
        }
        System.out.println(cnt);
    }
}