import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, c;
        a = scanner.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = scanner.nextInt();
        }
        c = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < a; i++) {
            if (b[i] == c) {
                result++;
            }
        }
        System.out.println(result);
    }
}