package algorithm.dynamicProgramming;

import java.util.Scanner;

public class Bj11726_2xnTileing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n];
        dp[0] = 1;
        if(n > 1) dp[1] = 2;
        for(int i = 2; i < n ; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }
        System.out.println(dp[n-1]);
    }
}
