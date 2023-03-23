import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int max = 0;
        double[] num = new double[a];
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            num[i] = b;
            if (max < b) {
                max = b;
            }
        }
        for (int i = 0; i < a; i++) {
            double n = num[i];
            num[i] = (n / max) * 100;
        }
        System.out.println(Arrays.stream(num).sum() / a);
    }
}