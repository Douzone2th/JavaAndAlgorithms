package Baekjun;

import java.util.*;

public class Baekjoon_2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[301];
		long[] dp = new long[301];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextLong();
		}
		dp[1] = arr[1];
		dp[2] = dp[1]+arr[2];
		for (int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i-2], (arr[i-1]+dp[i-3])) + arr[i];
		}
		System.out.println(dp[n]);
	}
}
