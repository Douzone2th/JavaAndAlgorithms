package week_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_14244 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int leaf = 0;
		if(M == 2) {
			leaf = 1; // 중심 노드를 리프로 포함
		}
		int last_leaf = 0;
		for (int i = 1; i < N; i++) {
			if(M > leaf) {
				System.out.println(0 + " " + i);
				leaf += 1;
			}
			else {
				System.out.println(last_leaf + " " + i);
			}
			last_leaf = i;
		}
	}
}
