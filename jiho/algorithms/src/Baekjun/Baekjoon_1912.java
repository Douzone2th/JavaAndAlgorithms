import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		int r = -1000;
		
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
			dp[i] = arr[i];
		}
		
		for (int i = 1; i <= n; i++) {
			dp[i] = Math.max(dp[i], dp[i-1]+arr[i]);
			r=Math.max(r, dp[i]);
		}

		System.out.println(r);
	}

}