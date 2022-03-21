package week_9;

import java.util.Scanner;

public class bj15651 {

    static int[] arr;
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];

        dfs(0);
    }

    public static void dfs(int depth) {
        StringBuilder ans = new StringBuilder();
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                ans.append(arr[i] + " ");
            }
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= N; i++) {
            arr[depth] = i;
            dfs(depth + 1);
        }
    }
}
