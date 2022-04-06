package weeks_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon18511 {
	static int[] ary;
	static int testcase;
	static int length;
	static int ans;
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stz = new StringTokenizer(br.readLine());
			testcase = Integer.parseInt(stz.nextToken());
			length = Integer.parseInt(stz.nextToken());
			stz = new StringTokenizer(br.readLine());
			ary = new int[length];
			for(int i = 0; i < length; i++) {
				ary[i] = Integer.parseInt(stz.nextToken());
			}
			solution(0);
			System.out.println(ans);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	public static void solution(int count) {
		if(count > testcase) return;
		if(ans < count) ans = count;
		for(int i = length-1; i > -1; i--) solution(count*10 + ary[i]);
	}
}
