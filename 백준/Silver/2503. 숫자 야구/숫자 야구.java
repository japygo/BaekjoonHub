import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] hints = new int[N][3];
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            int strike = scanner.nextInt();
            int ball = scanner.nextInt();
            hints[i][0] = num;
            hints[i][1] = strike;
            hints[i][2] = ball;
        }

        int count = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i == j || j == k || k == i) {
                        continue;
                    }

                    int cnt = 0;
                    for (int[] hint : hints) {
                        int num = hint[0];
                        int strike = hint[1];
                        int ball = hint[2];
                        int strikeCnt = 0;
                        int ballCnt = 0;

                        int first = num / 100;
                        int second = num % 100 / 10;
                        int third = num % 100 % 10;

                        if (i == first) {
                            strikeCnt++;
                        }
                        if (j == second) {
                            strikeCnt++;
                        }
                        if (k == third) {
                            strikeCnt++;
                        }
                        if (i == second || i == third) {
                            ballCnt++;
                        }
                        if (j == third || j == first) {
                            ballCnt++;
                        }
                        if (k == first || k == second) {
                            ballCnt++;
                        }

                        if (ball == ballCnt && strike == strikeCnt) {
                            cnt++;
                        }
                    }

                    if (cnt == N) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}