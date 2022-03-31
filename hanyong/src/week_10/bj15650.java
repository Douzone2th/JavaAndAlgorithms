package week_10;

import java.util.Scanner;

public class bj15650 {

    static int[] arr;
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];

        dfs(1,0);
    }

    public static void dfs(int num, int depth) {
        StringBuilder ans = new StringBuilder();
        if (depth == M) {
            for (int val:arr) {
                ans.append(val + " ");
            }
            System.out.println(ans);
            return;
        }

        for (int i = num; i <= N; i++) {
            arr[depth] = i;
            dfs(i+1, depth + 1);
        }
    }
}
