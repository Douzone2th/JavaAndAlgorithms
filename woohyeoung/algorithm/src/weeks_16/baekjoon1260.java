package weeks_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon1260 {
	public static void main(String[] args) {
		BufferedReader br = null;
		StringTokenizer stz;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			stz = new StringTokenizer(br.readLine());
			int node = conv(stz.nextToken());
			int line = conv(stz.nextToken());
			int start = conv(stz.nextToken());
			list = new int[node + 1][node + 1];
			for(int i = 1; i <= line; i++) {
				stz = new StringTokenizer(br.readLine());
				int n = conv(stz.nextToken());
				int m = conv(stz.nextToken());
				list[n][m] = 1;
				list[m][n] = 1;
			}
			solution(node, start);
			System.out.println(sb);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	static void solution(int node, int start) {
		visitied = new int[node+1];
		dfs(start);
		sb.append('\n');
		visitied = new int[node+1];
		bfs(start);
	}
	static void dfs(int n) {
		visitied[n] = 1;
		sb.append(n).append(' ');
		for(int i = 1; i < list.length; i++) {
			if(list[n][i] == 1 && visitied[i] != 1) {
				dfs(i);
			}
		}
	}
	static void bfs(int n) {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.offer(n);
		visitied[n] = 1;
		while(!qu.isEmpty()) {
			n = qu.poll();
			sb.append(n).append(' ');
			for(int i = 1; i < list.length; i++) {
				if(list[n][i] == 1 && visitied[i] != 1) {
					qu.offer(i);
					visitied[i] = 1;
				}
			}
		}
	}
	static int conv(String str) { return Integer.parseInt(str); }
	static int[] visitied;
	static int[][] list;
	static StringBuilder sb = new StringBuilder();
}
