package week_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_15681 {
	static ArrayList<ArrayList<Integer>> graph;
	static int[] dp;

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	graph = new ArrayList<>();
	
	int n = Integer.parseInt(st.nextToken());
	int r = Integer.parseInt(st.nextToken());
	int q = Integer.parseInt(st.nextToken());
	
	dp = new int [n+1];
	
	for (int i = 0; i <= n; i++) {
		graph.add(new ArrayList<>());
	}
	
	// 트리 간선 생성
	for (int i = 0; i < n-1; i++) {
		st = new StringTokenizer(br.readLine());
		int u = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
	//트리 생성
	buildTree(r, -1);
	
	
	StringBuilder sb = new StringBuilder();
	
	// 출력하기위해 쿼리의 수만큼 결과 생성
	for (int i = 0; i < q; i++) {
		int u = Integer.parseInt(br.readLine());
		sb.append(dp[u]).append("\n");
	}
	bw.write(sb.toString());
	bw.close();
	br.close();
}
	
	static int buildTree(int cur, int parent) {
		// dp[cur]이 0이 아니면 연결된 노드이므로
		if(dp[cur] != 0) {
			return dp[cur];
		}
		dp[cur] = 1;
		
		for (int child : graph.get(cur)) {
			// parent 와 child 가 같으면 안되므로
			// 사이클이 없고 부모는 무조건 하나이므로 가능
			if (parent != child) {
				dp[cur] += buildTree(child, cur);
			}
		}
		return dp[cur];
			
		}
	}

//자료구조
//1. 집합임시저장
//	List	- 순서, 중복허용(배열 확장)
//			- ArrayList(Vector)
//			
//	Set		- 순서가 없고, 중복 불허용
//			- 향상된 for / Iterator
//			- HashSet
//			
//	Map		- 키, 값 구조
//			- 키만 가져올 지 / 값만 가져올 지
//			- HashMap, Properties
//	
//	*엑셀 형식 처리하기(행과 열이 있는 2차원 배열)
//	1. 2차원 배열 / 2차원 ArrayList 사용
//	2. 1차원 배열 + 객체 / 1차원 ArrayList + 객체 (많이 사용)
//	* 1차원 ArrayList + HashMap
//	
//	*stack, queue
