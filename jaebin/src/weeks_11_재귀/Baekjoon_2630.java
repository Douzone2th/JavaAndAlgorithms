package weeks_11_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 2630번 : 색종이 만들기
public class Baekjoon_2630 {
    public static int white = 0;
    public static int blue = 0;
    public static int n;
    public static int arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //2, 4, 8, 16, 32, 64, 128
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        rec(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void rec(int row, int col, int size) {
        //check
        if (check(row, col, size)) {
            if (arr[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }
        int newSize = size / 2;    // 절반 사이즈
        rec(row, col, newSize);                        // 2사분면
        rec(row, col + newSize, newSize);                // 1사분면
        rec(row + newSize, col, newSize);                // 3사분면
        rec(row + newSize, col + newSize, newSize);    // 4사분면
    }

    public static boolean check(int row, int col, int size) {
        int color = arr[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] != color) {
                    return false;
                }
            }
        }
        // 다같아야됨
        return true;
    }
}
