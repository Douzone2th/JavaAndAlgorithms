package Baekjun;

import java.util.*;

public class Baekjoon_15988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		long[] dp = new long[1000000+1];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			for (int j = 4; j <= n; j++) {
				dp[j] = (dp[j-1]+dp[j-2]+dp[j-3])%1000000009;
			}
			System.out.println(dp[n]);
		}
	}

}
