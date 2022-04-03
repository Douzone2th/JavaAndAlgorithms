package week_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_15651 {
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
	// 15650번 문제와 비슷하지만 조건없이 모든 것을 출력하기 때문에 visit라는 들렀는지 안들렀는지 확인하는
	// 배열을 없애고 전체 출력하니 맞췄다.
	
	public static void recursion(int index) throws IOException { 
		if (index == M) { 
			for (int i = 0; i < M; i++) { 
				bw.write(arr[i] + " "); 
				} 
			bw.write("\n");
			return; 
			} 
			for (int i = 1; i <= N; i++) {
				arr[index] = i;
				recursion(index + 1);
			} 
	} 
} 





//stringbuilder로 만든것 stringbuilder가 메모리는 좀 더 잡아먹어도 빨랐다.

//public class Baekjoon_15651 {
//	static int M, N; 
//	static int[] arr; 
//	static boolean[] visit; 
//	static int index = 1; 
//	static StringBuilder sb = new StringBuilder();
//	
//	public static void main(String[] args) throws IOException {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
//		StringTokenizer st = new StringTokenizer(bf.readLine()); 
//		N = Integer.parseInt(st.nextToken()); 
//		M = Integer.parseInt(st.nextToken()); 
//		arr = new int[M]; visit = new boolean[N + 1];
//		recursion(0); 
//		System.out.println(sb);
//	}
//	public static void recursion(int index) { 
//		if (index == M) { 
//			for (int i = 0; i < M; i++) { 
//				sb.append(arr[i] + " ") ;
//				} 
//			sb.append("\n");
//			return; 
//			} 
//			for (int i = 1; i <= N; i++) {
//				arr[index] = i;
//				recursion(index + 1);
//			} 
//	} 
//} 
