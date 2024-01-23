import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] A;
    static int plusMaxCnt;
    static int minusMaxCnt;
    static int multipleMaxCnt;
    static int divideMaxCnt;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        plusMaxCnt = Integer.parseInt(stringTokenizer.nextToken());
        minusMaxCnt = Integer.parseInt(stringTokenizer.nextToken());
        multipleMaxCnt = Integer.parseInt(stringTokenizer.nextToken());
        divideMaxCnt = Integer.parseInt(stringTokenizer.nextToken());
        recur(1, A[0], 0, 0, 0, 0);
        System.out.println(max);
        System.out.println(min);
    }
    public static void recur(int index, int result, int plusCnt, int minusCnt, int multipleCnt, int divideCnt) {
        if (index == N) {
            if (plusCnt == plusMaxCnt && minusCnt == minusMaxCnt && multipleCnt == multipleMaxCnt && divideCnt == divideMaxCnt) {
                min = Math.min(min, result);
                max = Math.max(max, result);
            }
            return;
        }
        recur(index + 1, add(result, A[index]), plusCnt + 1, minusCnt, multipleCnt, divideCnt);
        recur(index + 1, subtract(result, A[index]), plusCnt, minusCnt + 1, multipleCnt, divideCnt);
        recur(index + 1, multiple(result, A[index]), plusCnt, minusCnt, multipleCnt + 1, divideCnt);
        recur(index + 1, divide(result, A[index]), plusCnt, minusCnt, multipleCnt, divideCnt + 1);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiple(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
}