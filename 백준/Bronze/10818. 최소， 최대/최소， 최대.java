import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        int min = 0, max = 0;
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            if (b < min || i == 0) {
                min = b;
            }
            if (b > max || i == 0) {
                max = b;
            }
        }
        System.out.println(min + " " + max);
    }
}