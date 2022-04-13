package weeks_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon11725 {
	public static void main(String[] args) {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		int n, m;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			ArrayList<ArrayList<Integer>> list = new ArrayList<>();
			Queue<Integer> queue = new LinkedList<Integer>();
			int[] ary = new int[testcase+1];
			for(int i = 1; i <=testcase+1 ; i++) {
				list.add(new ArrayList<Integer>());
			}
			for(int i = 1; i< testcase; i++) {
				StringTokenizer stz = new StringTokenizer(br.readLine(), " ");
				n = Integer.parseInt(stz.nextToken());
				m = Integer.parseInt(stz.nextToken());
				list.get(n).add(m);
				list.get(m).add(n);
			}
			queue.offer(1);
			ary[1] = 1;
			while(!queue.isEmpty()) {
				int a = queue.poll();
				for(int i : list.get(a)) {
					if(ary[i] == 0) {
						ary[i] = a;
						queue.offer(i);
					}
				}
			}
			for(int i = 2; i < ary.length; i++) {
				sb.append(ary[i]).append('\n');
			}
			sb.deleteCharAt(sb.length()-1);
			System.out.println(sb);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
