import java.util.*;

class Solution {
    boolean[] visited;
    int answer = -1;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        recur(k, dungeons, 0);
        
        return answer;
    }
    
    private void recur(int k, int[][] dungeons, int count) {        
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i]) {
                continue;
            }
            
            int req = dungeons[i][0];
            int use = dungeons[i][1];
            if (k < req) {
                continue;
            }
            
            visited[i] = true;
            recur(k - use, dungeons, count + 1);
            visited[i] = false;
        }
        
        answer = Math.max(answer, count);
    }
}