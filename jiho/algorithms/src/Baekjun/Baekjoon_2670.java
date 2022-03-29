package Baekjun;

import java.util.*;

public class Baekjoon_2670 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n+1];
		double[] dp = new double[n+1];
		double r = Double.MIN_VALUE;
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		dp[1] = arr[1];
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.max(arr[i], dp[i-1] * arr[i]);
			r = Math.max(r, dp[i]);
		}
		
		System.out.println(String.format("%.3f", r));
	}

}
