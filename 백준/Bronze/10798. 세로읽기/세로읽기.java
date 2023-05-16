import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        String[] str = new String[5];
        int maxLength = 0;
        for (int i = 0; i < 5; i++) {
            str[i] = scanner.nextLine();
            int length = str[i].length();
            if (maxLength < length) {
                maxLength = length;
            }
        }
        String[][] arr = new String[5][maxLength];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(arr[i], " ");
            String[] a = str[i].split("");
            System.arraycopy(a, 0, arr[i], 0, a.length);
        }
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (!arr[j][i].equals(" ")) {
                    result.append(arr[j][i]);
                }
            }
        }
        System.out.println(result);
    }
}