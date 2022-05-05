package Baekjun;

import java.util.*;

public class Baekjoon_14494 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		long[][] dp = new long[1000][1000];
		
		dp[0][0] = 1;
		for (int i = 1; i < m; i++) {
			dp[0][i] = 1;
		}
		for (int i = 1; i < n; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(j-1<0) {
					continue;
				}else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j] + dp[i][j-1] )%1000000007;
				}
				dp[i][j]%=1000000007;
			}
		}
		
		System.out.println(dp[n-1][m-1]);
		
	}

}
