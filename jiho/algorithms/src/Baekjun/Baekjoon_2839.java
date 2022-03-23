package Baekjun;

import java.util.*;

public class Baekjoon_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		Arrays.fill(dp, 5000);
		
		if(n>=3) {
			dp[3] = 1;
		}
		if(n>=5) {
			dp[5] = 1;
		}
		for(int i=6; i <= n; i++) {
			dp[i] = Math.min(dp[i-3], dp[i-5])+1;
		}
		if(dp[n]>=5000) {
			System.out.println(-1);
		}else {
			System.out.println(dp[n]);
		}
	}

}
