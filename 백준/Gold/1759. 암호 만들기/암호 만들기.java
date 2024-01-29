import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int L;
    static int C;
    static String[] chars;
    static StringBuilder result = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        L = Integer.parseInt(stringTokenizer.nextToken());
        C = Integer.parseInt(stringTokenizer.nextToken());
        chars = new String[C];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < C; i++) {
            chars[i] = stringTokenizer.nextToken();
        }
        Arrays.sort(chars);
        recur(new ArrayList<>());
        System.out.println(result);
    }
    public static void recur(List<String> word) {
        if (word.size() == L) {
            int mo = 0;
            int ja = 0;
            for (String s : word) {
                if (isMo(s)) {
                    mo++;
                } else {
                    ja++;
                }
            }
            if (mo < 1 || ja < 2) {
                return;
            }
            result.append(String.join("", word)).append("\n");
            return;
        }
        for (int i = 0; i < C; i++) {
            if (!word.isEmpty()) {
                if (word.contains(chars[i])) {
                    continue;
                }
                if (word.get(word.size() - 1).compareTo(chars[i]) >= 0) {
                    continue;
                }
            }
            word.add(chars[i]);
            recur(word);
            word.remove(chars[i]);
        }
    }
    private static boolean isMo(String s) {
        switch (s) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                return true;
            default:
        }
        return false;
    }
}