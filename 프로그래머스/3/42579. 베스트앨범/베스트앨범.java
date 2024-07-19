import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, List<Song>> genresMap = new HashMap<>();
        Map<String, Integer> genresCountMap = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            
            List<Song> songList = genresMap.getOrDefault(genre, new ArrayList<>());
            songList.add(new Song(i, plays[i]));
            genresMap.put(genre, songList);
            
            genresCountMap.put(genre, genresCountMap.getOrDefault(genre, 0) + plays[i]);
        }
        
        List<String> keys = new ArrayList<>(genresCountMap.keySet());
        Collections.sort(keys, (o1, o2) -> genresCountMap.get(o2) - genresCountMap.get(o1));
        
        List<Integer> result = new ArrayList<>();
        for (String key : keys) {
            List<Song> songList = genresMap.get(key);
            Collections.sort(songList, (o1, o2) -> {
                if (o2.play == o1.play) {
                    return o1.index - o2.index;
                }
                return o2.play - o1.play;
            });
            
            for (int i = 0; i < songList.size(); i++) {
                if (i == 2) {
                    break;
                }
                result.add(songList.get(i).index);
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
    
    class Song {
        private int index;
        private int play;

        public Song(int index, int play) {
            this.index = index;
            this.play = play;
        }

        @Override
        public String toString() {
            return "index: " + index + " play: " + play;
        }
    }
}