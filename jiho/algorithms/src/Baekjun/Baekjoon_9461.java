package Baekjun;

import java.util.*;

public class Baekjoon_9461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long[] arr = {0, 1, 1, 1, 2, 2};
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			long[] dp = new long[n+1];
			
			for (int j = 1; j<arr.length; j++) {
				if(n<j) {
					break;
				}
				dp[j] = arr[j];
			}
			
			for (int j = arr.length; j <= n; j++) {
				dp[j] = dp[j-5] + dp[j-1];
			}
			
			System.out.println(dp[n]);
		}
	}

}
