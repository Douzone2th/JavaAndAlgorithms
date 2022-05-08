package weeks_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon15651 {
	static int k = 1;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int testcase = Integer.parseInt(stz.nextToken());
			int length = Integer.parseInt(stz.nextToken());
			solution(testcase, length);
			System.out.println(sb);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	public static void solution(int testcase, int length) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		loop(arr, testcase, length);
	}
	public static void loop(ArrayList<Integer> arr, int testcase, int length) {
		if(arr.size() == length) {
			for(int i : arr) sb.append(i).append(' ');
			sb.append('\n');
			return;
		}
		for(int i = 1; i <= testcase; i++) {
			arr.add(i);
			loop(arr, testcase, length);
			arr.remove(arr.size()-1);
		}
	}
}