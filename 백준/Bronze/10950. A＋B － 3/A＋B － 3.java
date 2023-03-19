import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        int[] r = new int[a];

        for (int i = 0 ; i < a ; i++) {
            b = scanner.nextInt();
            c = scanner.nextInt();
            r[i] = b + c;
        }
        for (int i = 0 ; i < a ; i++) {
            System.out.println(r[i]);
        }
    }
}