package weeks_14_브루트포스_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11047 {
	static int[] ary;
	static int count = 0;
	public static void main(String[] args) {
		BufferedReader br = null;
		StringTokenizer stz;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			stz = new StringTokenizer(br.readLine());
			int testcase = Integer.parseInt(stz.nextToken());
			int value = Integer.parseInt(stz.nextToken());
			ary = new int[testcase];
			for(int i = 0; i < testcase; i++) {
				ary[i] = Integer.parseInt(br.readLine());
			}
			solution(value, testcase);
			System.out.println(count);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	public static void solution(int value, int n) {
		for (int i = n-1; i >= 0 ; i--) {
			if(ary[i] <= value) {
				count += value / ary[i];
				value %= ary[i];
				
			}
		}
	}
}
