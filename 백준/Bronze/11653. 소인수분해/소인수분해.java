import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 2;
        while (a != 1) {
            if (a % b == 0) {
                System.out.println(b);
                a /= b;
                b = 2;
            } else {
                b++;
            }
        }
    }
}