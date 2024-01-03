import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][2];
        int maxL = Integer.MIN_VALUE;
        int maxH = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int L = scanner.nextInt();
            int H = scanner.nextInt();
            arr[i][0] = L;
            arr[i][1] = H;
            maxL = Math.max(maxL, L);
            maxH = Math.max(maxH, H);
        }

        int[] heights = new int[maxL + 1];
        for (int i = 0; i < N; i++) {
            heights[arr[i][0]] = arr[i][1];
        }

        int[] prefix = new int[heights.length + 1];
        int before = heights[0];
        boolean isMaxH = false;
        int nextH = maxH;
        for (int i = 0; i < heights.length; i++) {
            if (isMaxH) {
                prefix[i + 1] = prefix[i] + nextH;
            } else {
                if (heights[i] <= before) {
                    prefix[i + 1] = prefix[i] + before;
                } else {
                    prefix[i + 1] = prefix[i] + heights[i];
                    before = heights[i];
                }
            }
            if (heights[i] == nextH) {
                isMaxH = true;
                nextH = -1;
                for (int j = i + 1; j < heights.length; j++) {
                    nextH = Math.max(nextH, heights[j]);
                }
            }
        }
        System.out.println(prefix[heights.length]);
    }
}