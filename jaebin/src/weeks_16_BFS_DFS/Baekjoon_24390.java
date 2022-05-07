package weeks_16_BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//백준 알고리즘 24390번 또 전자레인지야
// 실패 : 런타임 에러 (ArrayIndexOutOfBounds)
public class Baekjoon_24390 {
    public static int[] button = {10, 60, 600, 30};

    public static class Data {
        public int second;
        public int cnt;
        public boolean flag;

        public Data(int second, int cnt, boolean flag) {
            this.second = second;
            this.cnt = cnt;
            this.flag = flag;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        s += m * 60;

        boolean[][] visited = new boolean[3601][2];

        LinkedList<Data> q = new LinkedList<Data>();
        q.offer(new Data(0, 0, false));
        visited[0][0] = true;

        while (!q.isEmpty()) {
            var now = q.peek();
            q.poll();

            if (now.second == s && now.flag) {
                System.out.print(now.cnt);
                System.out.print('\n');
            }

            for (int i = 0; i < 4; i++) {
                Data next = new Data(now.second + button[i], now.cnt + 1, now.flag);

                if (i == 3 && !now.flag) {
                    next.flag = true;

                    if (now.second > 0) {
                        next.second -= button[i];
                    }
                }
                int nextFlag = next.flag ? 1 : 0;

                if (!visited[next.second][nextFlag] && next.second <= s) {
                    visited[next.second][nextFlag] = true;
                    q.offer(next);
                }
            }
        }
    }
}
