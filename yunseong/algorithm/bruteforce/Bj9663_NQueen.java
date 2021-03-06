package algorithm.bruteforce;

import java.util.Scanner;
//답보고 품
public class Bj9663_NQueen {
    public static int N;
    public static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            int[] col = new int[N+1];


            col[1] = i;

            dfs(col, 1);
        }

        System.out.println(count);
    }

    public static void dfs(int[] col, int row) {
        if(row == N) {
            count++;
        }else {

            for(int i = 1; i <= N; i++) {
                col[row+1] = i;
                if(isPossible(col, row+1)) {
                    dfs(col, row+1);
                }
            }
        }
    }

    public static boolean isPossible(int[] col, int row) {


        for(int i=1; i < row; i++) {

            if(col[i] == col[row]) return false;


            if(Math.abs(i - row) == Math.abs(col[i] - col[row])) return false;
        }
        return true;
    }
}

