import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                result.append(arr1[i][j] + arr2[i][j]);
                if (j < b - 1) {
                    result.append(" ");
                }
            }
            if (i < a - 1) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}