package weeks_15_구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1913번 달팽이
//분류 : 구현
public class Baekjoon_1913 {
    public static int[][] arr;
    //하 우 상 좌
    public static int[] dy = {1, 0, -1, 0};
    public static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        int count = n * n;
        int x = 0;
        int y = 0;
        int d = 0;// 방향

        while (true) {
            if (count == 0) {
                break;
            }
            //먼저 넣고 빼기
            arr[y][x] = count--;
            int ny = y + dy[d];
            int nx = x + dx[d];

            int nd = checkDir(d, n, nx, ny);
            // 검사한 방향이랑 현재 방향이랑 다르면, 방향을 바꿈
            if (nd != d) {
                y = y + dy[nd];
                x = x + dx[nd];
                d = nd;
            } else {
                y = ny;
                x = nx;
            }
        }
        int resultX = 0;
        int resultY = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == k) {
                    resultX = i + 1;
                    resultY = j + 1;
                }
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }
        sb.append(resultX + " " + resultY);
        System.out.println(sb);
    }

    public static int checkDir(int d, int n, int nx, int ny) {
        // 범위를 벗어나면 방향 +1
        if (nx >= n || ny >= n || nx < 0 || ny < 0) {
            d = (d + 1) % 4;
            // 있을자리에 이미 값이 있으면 방향 +1
        } else if (arr[ny][nx] != 0) {
            d = (d + 1) % 4;
        }
        return d;
    }
}
