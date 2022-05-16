package weeks_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon7576 {
	static int[][] container;
	public static void main(String[] args) {
		BufferedReader br = null;
		StringTokenizer stz;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			stz = new StringTokenizer(br.readLine());
			int lengthY = conv(stz.nextToken());
			int lengthX = conv(stz.nextToken());
			container = new int[lengthX][lengthY];
			for(int i = 0; i < lengthX; i++) {
				stz = new StringTokenizer(br.readLine());
				for(int j = 0; j < lengthY; j++) {
					container[i][j] = conv(stz.nextToken());
				}
			}
			System.out.println(solution(lengthX, lengthY));
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	static int solution(int x, int y) {
		Queue<Coordinate> qu = new LinkedList<Coordinate>();
		for(int i =0; i < x; i++)
			for(int j = 0; j < y; j++)
				if(container[i][j] == 1) qu.offer(new Coordinate(i, j));
		while(!qu.isEmpty()) {
			Coordinate co = qu.poll();
			for(int i = 0; i < 4; i++) {
				int nextX = co.x + dx[i];
				int nextY = co.y + dy[i];
				
				if(nextX < 0 || nextY < 0 || nextX >= x || nextY >= y) continue;
				if(container[nextX][nextY] != 0) continue;
				container[nextX][nextY] = container[co.x][co.y] + 1;
				qu.offer(new Coordinate(nextX, nextY));
			}
		}
		int max = 0;
		for(int i = 0; i< x; i++)
			for(int j = 0; j < y; j++) {
				if(container[i][j] == 0) return -1;
				max = Math.max(max, container[i][j]);
			}
		return max-1;
	}
	static int conv(String str) { return Integer.parseInt(str); }
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
}
class Coordinate {
	int x, y;
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
