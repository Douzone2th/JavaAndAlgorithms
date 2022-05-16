package weeks_15_구현.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 16926번 : 배열돌리기 1
//분류 : 구현
public class Baekjoon_16926 {
    // 상 우 하 좌
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int loopStep = Math.min(n,m)/2;

        //회전에 대한 루프
        for (int i = 0; i < r; i++) {
            //바깥 사각형부터 제일 안쪽 사각형까지 돌릴 루프
            for (int j = 0; j < loopStep; j++) {
                //처음은 0,0 2단계는 1,1
                int x = j;
                int y = j;
                // 마지막에 첫번째 값을 넣어줘야하기 때문
                int temp = arr[x][y];
                int dir = 0;
                while (dir < 4) {
                    int xx = x + dx[dir];
                    int yy = y + dy[dir];
                    if (xx >= j && xx < n - j && yy >= j && yy < m - j) {
                        arr[x][y] = arr[xx][yy];
                        x = xx;
                        y = yy;
                    } else {
                        dir++;
                    }
                }
                arr[j + 1][j] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
