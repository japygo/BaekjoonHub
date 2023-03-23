import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] basket = IntStream.rangeClosed(1, a).toArray();
        for (int i = 0; i < b; i++) {
            int c = scanner.nextInt() - 1;
            int d = scanner.nextInt() - 1;
            int[] tmp = new int[d - c + 1];
            for (int j = 0; j <= (d - c); j++) {
                tmp[j] = basket[d - j];
            }
            System.arraycopy(tmp, 0, basket, c, d - c + 1);
        }
        System.out.println(Arrays.stream(basket).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}