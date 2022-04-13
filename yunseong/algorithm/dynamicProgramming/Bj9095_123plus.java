package algorithm.dynamicProgramming;

import java.util.Scanner;

public class Bj9095_123plus {
    public static void main(String[] args) {
        //1 1
        //2 2
        //3 4
        //4 7
        //5
        //6 24      1+1+1+1+1+1/ 1+1+1+1+2/ 1+1+1+2+1/ 1+1+2+1+1/ 1+2+1+1+1/ 2+1+1+1+1/
        //          1+1+2+2/ 1+2+2+1/ 2+2+1+1/2+1+1+2/ 2+1+2+1/ 1+2+1+2/ 1+2+2+1
        //          1+2+3/ 2+3+1/2+1+3/ 1+3+2/ 3+2+1/ 3+1+2/
        //          2+2+2/ 3+3/
        //          1+1+1+3/  1+1+3+1/ 1+3+1+1/ 3+1+1+1
        //7 44
        //8
        //9
        //10 274

        // 11111 1112 1121 1211 2111 23 32 113 131 311 221 212 122
        // 1 2 4 7 13 24 44  274
        // n-1 n-2 n-3

        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        for(int j = 0 ; j < cnt ; j++) {
            int n = s.nextInt();
            int[] dp = new int[n];

            if (n == 1) {
                System.out.println(1);
            } else if (n == 2) {
                System.out.println(2);
            } else if (n == 3) {
                System.out.println(4);
            } else {
                dp[0] = 1;
                dp[1] = 2;
                dp[2] = 4;
                for (int i = 3; i < n; i++) {
                    dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
                }
                System.out.println(dp[n - 1]);
            }
        }
    }
}
