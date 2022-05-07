package weeks_16_BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

//백준 알고리즘 7576번 토마토
//분류 : BFS
public class Beakjoon_7576 {
    // 좌우
    public static int[] dx = {0, 0, -1, 1};
    // 상하
    public static int[] dy = {-1, 1, 0, 0};
    public static int[][] arr;
    public static int daysCnt;
    public static LinkedList<Tot> queue = new LinkedList<>();

    // 토마토 좌표
    public static class Tot {
        int x, y;

        public Tot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        //n이 y축 - 세로축
        //m이 x축 - 가로축
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int input = Integer.parseInt(st.nextToken());
                if (input == 1) {
                    queue.offer(new Tot(j, i));
                }
                arr[i][j] = input;
            }
        }
        bfs();

        if (isSure()) {
            System.out.println(daysCnt - 1);
        } else {
            System.out.println(-1);
        }
    }

    public static void bfs() {
        while (!queue.isEmpty()) {
            Tot tot = queue.poll();

            // 상하좌우
            for (int i = 0; i < 4; i++) {
                int nextX = tot.x + dx[i];
                int nextY = tot.y + dy[i];

                if (!checkSize(nextX, nextY)) {
                    continue;
                }
                if (!check(nextX, nextY)) {
                    continue;
                }

                // 최대 일수를 구하기 때문에 1로 바꾸는게 아니라 현재 일수 +1
                arr[nextY][nextX] = arr[tot.y][tot.x] + 1;
                queue.offer(new Tot(nextX, nextY));
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                daysCnt = Math.max(daysCnt, arr[i][j]);
            }
        }
    }

    public static boolean check(int x, int y) {
        if (arr[y][x] != 0) {
            return false;
        } else return true;
    }

    public static boolean checkSize(int x, int y) {
        if (x >= arr[0].length || x < 0 || y >= arr.length || y < 0) {
            return false;
        }
        return true;
    }

    public static boolean isSure() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
