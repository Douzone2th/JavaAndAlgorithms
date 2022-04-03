package week_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_15650 { 
	
	static int M, N; 
	static int[] arr; 
	static boolean[] visit; 
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	static int index = 1; 
	public static void main(String[] args) throws IOException { 
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		N = Integer.parseInt(st.nextToken()); 
		M = Integer.parseInt(st.nextToken()); 
		arr = new int[M]; visit = new boolean[N + 1];
		recursion(0); 
		bw.flush(); 
		bw.close(); 
		
	} 
	public static void recursion(int index) throws IOException { 
		// 밑 재귀를 통해 index가 M과 같아지면 buffer에 출력할 것들을 추가, 종료문
		if (index == M) { 
			for (int i = 0; i < M; i++) { 
				bw.write(arr[i] + " "); 
				} 
			bw.write("\n");
			return; 
			} 
			// visit 라는 boolean 배열을 만들어 이전에 방문하지 않았다면 방문하여 arr에 추가하고 
			// 그 숫자의 visit 인덱스를 true로 바꿔 다시 자신을 호출한다. 
			// 더이상 방문하지 않은
			for (int i = 1; i <= N; i++) {
				if(!visit[i]) { 
					arr[index] = i;
					visit[i] = true;
					recursion(index + 1);
					for (int j = i + 1; j <= N; j++) {
						visit[j] = false; 
					} 
				} 
			} 
	} 
}