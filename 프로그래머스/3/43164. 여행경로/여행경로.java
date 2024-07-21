import java.util.*;

class Solution {
    List<String> result;
    boolean[] visited;
    boolean isFinished;
    String[] answer;
    
    public String[] solution(String[][] tickets) {        
        result = new ArrayList<>();
        visited = new boolean[tickets.length];
        isFinished = false;
        
        Arrays.sort(tickets, (o1, o2) -> {
            if (o1[0].equals(o2[0])) {
                return o1[1].compareTo(o2[1]);
            }
            return o1[0].compareTo(o2[0]);
        });
        
        System.out.println(Arrays.deepToString(tickets));
        
        recur("ICN", tickets, 0);
                
        return answer;
    }
    
    private void recur(String airport, String[][] tickets, int count) {
        if (isFinished) {
            return;
        }
        
        result.add(airport);

        if (count == tickets.length) {
            isFinished = true;
            answer = new String[result.size()];
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
            return;
        }
        
        for (int i = 0; i < tickets.length; i++) {
            if (visited[i]) {
                continue;
            }
            String departure = tickets[i][0];
            String arrival = tickets[i][1];
            if (!airport.equals(departure)) {
                continue;
            }
            visited[i] = true;
            recur(arrival, tickets, count + 1);
            visited[i] = false;
        }
        result.remove(result.size() - 1);
    }
}