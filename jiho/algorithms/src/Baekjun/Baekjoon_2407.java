package Baekjun;

import java.math.BigInteger;
import java.util.*;

public class Baekjoon_2407 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		BigInteger[] dp = new BigInteger[101];
		
		dp[5] = BigInteger.valueOf(120);
		for (int i = 6; i < dp.length; i++) {
			dp[i] = BigInteger.valueOf(i).multiply(dp[i-1]);
		}
		
		System.out.println( dp[n].divide(dp[n-m]).divide(dp[m]) );
	}

}
