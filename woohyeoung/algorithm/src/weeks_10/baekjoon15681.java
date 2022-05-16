package weeks_10_트리_백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class baekjoon15681 {
	static LinkedList<Integer>[] list;
	static boolean[] visitied;
	static int[] dp;
	public static void main(String[] args) {
		BufferedReader br = null;
		StringTokenizer stz;
		StringBuilder sb = new StringBuilder();
		int n, m;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			stz = new StringTokenizer(br.readLine());
			int testcase = Integer.parseInt(stz.nextToken());
			int node = Integer.parseInt(stz.nextToken());
			int question = Integer.parseInt(stz.nextToken());
			
			dp = new int[testcase+1];
			list = new LinkedList[testcase+1];
			visitied = new boolean[testcase+1];
			for(int i = 0; i < list.length; i++) list[i] = new LinkedList<Integer>();
			for(int i = 1; i < testcase; i++) {
				stz = new StringTokenizer(br.readLine());
				n = Integer.parseInt(stz.nextToken());
				m = Integer.parseInt(stz.nextToken());
				list[n].add(m);
				list[m].add(n);
			}
			dfs(node);
			for(int i = 0; i < question; i++) {
				int q = Integer.parseInt(br.readLine());
				sb.append(dp[q]).append('\n');
			}
			System.out.println(sb);
		} catch (NumberFormatException ne) {
			ne.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	public static int dfs(int node) {
		if(dp[node] != 0) return dp[node];
		visitied[node] = true;
		int count = 1;
		for(int n : list[node]) {
			if(visitied[n]) continue;
			count += dfs(n);
		}
		dp[node] = count;
		return dp[node];
	}
}