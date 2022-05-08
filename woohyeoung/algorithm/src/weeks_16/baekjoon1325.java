package weeks_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon1325 {
	static List<Integer>[] list;
	static int[] visitied;
	static int[] answer;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		BufferedReader br = null;
		StringTokenizer stz;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			stz = new StringTokenizer(br.readLine());
			int com = conv(stz.nextToken());
			int tcase = conv(stz.nextToken());
			answer = new int[com+1];
			list = new ArrayList[com + 1];
			for(int i = 1; i <= com; i++) list[i] = new ArrayList<Integer>();
			for(int i = 1; i <= tcase; i++) {
				stz = new StringTokenizer(br.readLine());
				list[conv(stz.nextToken())].add(conv(stz.nextToken()));
			}
			solution(com);
			System.out.println(sb);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	static void solution(int n) {
		for(int i = 1; i <= n; i++) {
			visitied = new int[n+1];
			bfs(i);
		}
		int max = 0;
		for(int i = 1; i <= n; i++) max = Math.max(max, answer[i]);
		for(int i = 1; i <= n; i++)
			if(max == answer[i]) sb.append(i).append(' ');
	}
	static void bfs(int n) {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.offer(n);
		visitied[n] = 1;
		while(!qu.isEmpty()) {
			n = qu.poll();
			for(int next : list[n])
				if(visitied[next] == 0) {
					answer[next]++;
					visitied[next] = 1;
					qu.offer(next);
				}
		}
	}
	static int conv(String str) { return Integer.parseInt(str); }
}
