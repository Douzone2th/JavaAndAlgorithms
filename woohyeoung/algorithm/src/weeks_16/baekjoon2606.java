package weeks_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon2606 {
	static int[][] list;
	static int[] visitied;
	public static void main(String[] args) {
		BufferedReader br = null;
		StringTokenizer stz;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int com = conv(br.readLine());
			int conn = conv(br.readLine());
			list = new int[com+1][com+1];
			visitied = new int[com+1];
			for(int i = 1; i <= conn; i++) {
				stz = new StringTokenizer(br.readLine());
				int n = conv(stz.nextToken());
				int m = conv(stz.nextToken());
				list[n][m] = 1;
				list[m][n]	= 1;
			}
			System.out.println(solution());
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	static int solution() {
		return bfs(1);
	}
	static int bfs(int n) {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.offer(n);
		visitied[n] = 1;
		int count = 0;
		while(!qu.isEmpty()) {
			n = qu.poll();
			for(int i = 1; i < list.length; i++) {
				if(list[n][i] == 1 && visitied[i] != 1) {
					qu.offer(i);
					visitied[i] = 1;
					count++;
				}
			}
		}
		return count;
	}
	static int conv(String str) { return Integer.parseInt(str); }
}
