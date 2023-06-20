import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String command = stringTokenizer.nextToken();
            int num = 0;
            if (stringTokenizer.hasMoreTokens()) {
                num = Integer.parseInt(stringTokenizer.nextToken());
            }
            switch (command) {
                case "push":
                    queue.add(num);
                    break;
                case "pop":
                    result.append(queue.isEmpty() ? -1 : queue.poll());
                    break;
                case "size":
                    result.append(queue.size());
                    break;
                case "empty":
                    result.append(queue.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    result.append(queue.isEmpty() ? -1 : queue.peek());
                    break;
                case "back":
                    result.append(queue.isEmpty() ? -1 : queue.getLast());
                    break;
                default:
                    break;
            }
            if (i < n - 1 && !command.equals("push")) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}