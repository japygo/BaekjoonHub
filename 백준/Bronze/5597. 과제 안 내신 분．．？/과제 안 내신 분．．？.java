import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = IntStream.rangeClosed(1, 30).boxed().collect(Collectors.toList());
        for (int i = 1; i <= 28; i++) {
            int a = scanner.nextInt();
            list.remove(Integer.valueOf(a));
        }
        list.forEach(System.out::println);
    }
}