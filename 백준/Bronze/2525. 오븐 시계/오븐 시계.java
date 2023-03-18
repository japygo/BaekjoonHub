import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        a = a + c / 60;
        b = b + c % 60;

        a = a + b / 60;
        b = b % 60;

        a = a % 24;

        System.out.println(a + " " + b);
    }
}