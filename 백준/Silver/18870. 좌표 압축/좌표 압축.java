import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Integer[] arr = Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = set.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(map.get(arr[i]));
            if (i < n - 1) {
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder);
    }
}