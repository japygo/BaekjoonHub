import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] S;
    static List<Integer> startTeam = new ArrayList<>();
    static List<Integer> linkTeam = new ArrayList<>();
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        S = new int[N][N];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        recur(0);
        System.out.println(min);
    }
    public static void recur(int index) {
        if (startTeam.size() > N / 2 || linkTeam.size() > N / 2) {
            return;
        }
        if (startTeam.size() == N / 2 && linkTeam.size() == N / 2) {
            min = Math.min(min, Math.abs(sumTeam(startTeam) - sumTeam(linkTeam)));
            return;
        }
        startTeam.add(index);
        recur(index + 1);
        startTeam.remove(Integer.valueOf(index));
        linkTeam.add(index);
        recur(index + 1);
        linkTeam.remove(Integer.valueOf(index));
    }

    public static int sumTeam(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            for (Integer j : list) {
                if (Objects.equals(i, j)) {
                    continue;
                }
                sum += S[i][j];
            }
        }
        return sum;
    }
}