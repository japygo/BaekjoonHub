import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            double sum = 0;
            int[] nums = new int[b];
            for (int j = 0; j < b; j++) {
                nums[j] = scanner.nextInt();
                sum += nums[j];
            }
            double avg = sum / b;
            double cnt = 0;
            for (int j = 0; j < b; j++) {
                if (avg < nums[j]) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", cnt / b * 100);
        }
    }
}