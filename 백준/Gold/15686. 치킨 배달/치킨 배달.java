import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static List<House> cities;
    static List<House> chickens;
    static List<House> liveChickens;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        cities = new ArrayList<>();
        chickens = new ArrayList<>();
        liveChickens = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 1; j <= N; j++) {
                int num = Integer.parseInt(stringTokenizer.nextToken());
                if (num == 1) {
                    cities.add(new House(i, j));
                } else if (num == 2) {
                    chickens.add(new House(i, j));
                }
            }
        }
        recur(0);
        System.out.println(min);
    }

    public static void recur(int index) {
        if (liveChickens.size() == M) {
            min = Math.min(min, getSumDist());
            return;
        }
        if (liveChickens.size() > M || index > chickens.size()) {
            return;
        }
        for (House chicken : chickens) {
            boolean flag = false;
            for (House liveChicken : liveChickens) {
                if (liveChicken.compareTo(chicken) >= 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            liveChickens.add(chicken);
            recur(index + 1);
            liveChickens.remove(chicken);
        }
    }

    private static int getSumDist() {
        int sumDist = 0;
        for (House city : cities) {
            int minChickenDist = Integer.MAX_VALUE;
            for (House liveChicken : liveChickens) {
                minChickenDist = Math.min(minChickenDist, city.dist(liveChicken));
            }
            sumDist += minChickenDist;
        }
        return sumDist;
    }

    static class House implements Comparable<House> {
        private final int r;
        private final int c;

        public House(int r, int c) {
            this.r = r;
            this.c = c;
        }

        public int dist(House house) {
            return Math.abs(this.r - house.r) + Math.abs(this.c - house.c);
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;

            House house = (House) object;

            if (r != house.r) return false;
            return c == house.c;
        }

        @Override
        public int hashCode() {
            int result = r;
            result = 31 * result + c;
            return result;
        }

        @Override
        public int compareTo(House o) {
            if (this.r == o.r) {
                return this.c - o.c;
            }
            return this.r - o.r;
        }
    }
}