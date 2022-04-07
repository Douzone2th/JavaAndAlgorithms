package weeks_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2630 {
	static int w = 0;
	static int b = 0;
	static int[][] ary;
	public static void main(String[] args) {
		BufferedReader br = null;
		StringTokenizer stz;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			ary = new int[testcase][testcase];
			for(int i = 0; i < testcase; i++) {
				stz = new StringTokenizer(br.readLine(), " ");
				for(int j = 0; j < testcase; j++) {
					ary[i][j] = Integer.parseInt(stz.nextToken());
				}
			}
			solution(0, 0, testcase);
			System.out.println(w);
			System.out.println(b);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	public static void solution(int row, int col, int length) {
		if(colorCheck(row, col, length)) {
			if(ary[row][col] == 0) w++;
			else b++;
			return;
		}
		int n = length/2;
		solution(row, col, n);
		solution(row, col+n, n);
		solution(row+n, col, n);
		solution(row+n, col+n, n);
	}
	public static boolean colorCheck(int row, int col, int length) {
		int color = ary[row][col];
		for(int i = row; i < row+length; i++) {
			for(int j = col; j < col+length; j++) {
				if(ary[i][j] != color) return false;
			}
		}
		return true;
	}
}
