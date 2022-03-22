package Baekjun;

import java.util.*;

//가장 긴 감소하는 부분 수열
public class Baekjoon_11722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		int r = 0;
		
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
			dp[i] = 1;
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if(arr[i]<arr[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
			r = Math.max(r, dp[i]);
		}
		
		System.out.println(r);
	}

}
