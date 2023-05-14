import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] result = IntStream.rangeClosed(1, n).toArray();
        for (int i = 0; i < m; i++) {
            int begin = scanner.nextInt() - 1;
            int end = scanner.nextInt() - 1;
            int mid = scanner.nextInt() - 1;
            
            int length = end - begin + 1;
            int[] arr = new int[length];
            System.arraycopy(result, begin, arr, 0, length);

            int length1 = mid - begin;
            int length2 = end - mid + 1;
            System.arraycopy(result, mid, arr, 0, length2);
            System.arraycopy(result, begin, arr, length2, length1);

            System.arraycopy(arr, 0, result, begin, length);
        }
        System.out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}