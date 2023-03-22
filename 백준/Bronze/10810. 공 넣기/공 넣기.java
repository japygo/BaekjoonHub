import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] basket = new int[n];
        Arrays.fill(basket, 0);
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            for (int j = a - 1; j < b; j++) {
                basket[j] = c;
            }
        }
        System.out.println(Arrays.stream(basket).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}