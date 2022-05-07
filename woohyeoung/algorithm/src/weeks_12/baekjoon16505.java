package weeks_12_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon16505 {
	static char[][] ary;
	static int num;
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			num = Integer.parseInt(br.readLine());
			ary = new char[(int)Math.pow(2,num)][(int)Math.pow(2,num)];
			for(int i = 0; i < (int)Math.pow(2, num); i++) Arrays.fill(ary[i], ' ');
			recur(0, 0, 0);
			for(int i = 0; i < (int)Math.pow(2, num); i++) {
				for(int j = 0; j < (int)Math.pow(2,num)-i; j++) sb.append(ary[i][j]);
				if(i != (int)Math.pow(2,num)-1) sb.append('\n');
			}
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void recur(int count, int x, int y) {
		if(count == num) {
			ary[y][x] = '*'; return;
		}
		int z = (int)Math.pow(2, count);
		recur(count+1, x, y);
		recur(count+1, x+z, y);
		recur(count+1, x, y+z);
	}
}
