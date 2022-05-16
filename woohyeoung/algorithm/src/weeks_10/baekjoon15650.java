package weeks_10_트리_백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon15650 {
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
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(length == 1) one(testcase);
		else all(list, testcase+1, length, 1);
	}
	public static void one(int testcase) {
		for(int i = 1; i <= testcase; i ++) sb.append(i).append('\n');
	}
	public static void all(ArrayList<Integer> list, int testcase, int length, int count) {
		if(length == 0) {
			for(int i : list) sb.append(i).append(' ');
			sb.append('\n');
			return;
		}
		if(count == testcase) return;
		list.add(count); all(list, testcase, length-1, count+1);
		list.remove(list.size()-1); all(list, testcase, length, count+1);
	}
}