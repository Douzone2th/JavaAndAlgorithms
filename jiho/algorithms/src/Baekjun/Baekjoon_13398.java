import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int[][] dp = new int[n+1][2];
		int r = 0;
		
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp[1][0] = 0;
		dp[1][1] = arr[1];
		r=dp[1][1];
		for (int i = 2; i <= n; i++) {
			dp[i][0] = Math.max(dp[i-1][0]+arr[i], dp[i-1][1]);
			dp[i][1] = Math.max(arr[i], dp[i-1][1]+arr[i]);
			r=Math.max(r, Math.max(dp[i][0], dp[i][1]));
		}
		
		System.out.println(r);
	}
}