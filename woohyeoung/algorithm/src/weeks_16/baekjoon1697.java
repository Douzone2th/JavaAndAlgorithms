package weeks_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon1697 {
	static int[] move = new int[100001];
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int location = conv(stz.nextToken());
			int target = conv(stz.nextToken());
			System.out.println(solution(location, target));
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	static int solution(int location, int target) {
		if(location >= target) return location - target;
		else return bfs(location, target);
	}
	static int bfs(int now, int target) {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.offer(now);
		move[now] = 1;
		int next = 0;
		int current = 0;
		while(!qu.isEmpty()) {
			current = qu.poll();
			for(int i = 0; i < 3; i++) {
				if(i == 0) next = backward(current);
				else if(i == 1) next = forward(current);
				else next = teleport(current);
				if(next == target) return move[current];
				if(next >= 0 && next <= 100000 && move[next] == 0) {
						qu.offer(next);
						move[next] = move[current] + 1;
				}
			}
		}
		return 0;
	}
	static int conv(String str) { return Integer.parseInt(str); }
	static int teleport(int location) { return location *= 2; }
	static int forward(int location) { return location + 1; }
	static int backward(int location) { return location - 1; }
}
