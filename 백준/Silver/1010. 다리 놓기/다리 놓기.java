import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        int t = Integer.parseInt(stringTokenizer.nextToken());
        for (int i = 0; i < t; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int m = Integer.parseInt(stringTokenizer.nextToken());
            int[][] d = new int[m+1][m+1];
            for (int j = 0; j <= m; j++) {
                d[j][j] = 1;
                d[j][0] = 1;
                d[j][1] = j;
            }
            for (int j = 2; j <= m; j++) {
                for (int k = 1; k <= j; k++) {
                    d[j][k] = d[j-1][k] + d[j-1][k-1];
                }
            }
            result.append(d[m][n]);
            if (i < t - 1) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}