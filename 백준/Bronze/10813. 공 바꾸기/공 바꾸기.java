import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] basket = IntStream.rangeClosed(1, n).toArray();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            int tmp = basket[a];
            basket[a] = basket[b];
            basket[b] = tmp;
        }
        System.out.println(Arrays.stream(basket).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}