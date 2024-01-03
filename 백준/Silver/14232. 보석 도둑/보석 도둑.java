import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        List<Long> list = new ArrayList<>();
        for (long i = 2; i * i <= k; i++) {
            while (k % i == 0) {
                list.add(i);
                k /= i;
            }
        }
        if (k > 1) {
            list.add(k);
        }
        System.out.println(list.size());
        System.out.println(list.stream().sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}