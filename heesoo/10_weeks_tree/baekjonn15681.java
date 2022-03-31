import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baekjoon15681 {
	static int[] dp; //자식노드 개수 저장
	static ArrayList<ArrayList<Integer>> graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //정점의 수
		int R = Integer.parseInt(st.nextToken()); //루트 번호
		int Q = Integer.parseInt(st.nextToken()); //쿼리의 수
		
		graph = new ArrayList<>();
		dp = new int[N+1]; //0제외 1~N까지(index)
		
		for (int i = 0; i < N+1; i++) {  //0번 제외하고 1~N
			graph.add(new ArrayList<>());  
		}
		
		//트리 간선 생성
		for (int i = 0; i < N-1; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph.get(u).add(v); //index(u) : 노드 번호, v: 연결된 정점
			graph.get(v).add(u);
		}
		
		//트리 생성
		buildTree(R, -1);

		StringBuilder sb = new StringBuilder();
			for (int i = 0; i < Q; i++) {
				int u = Integer.parseInt(br.readLine());
				//sb.append(dp[i]+"\n");
			}
			for (int i = 0; i < N; i++) {
				sb.append(dp[i]+" ");
			}
			System.out.println(sb);
		}
		
		static int buildTree(int current, int parent) {
			//dp[current]가 0이 아니면 연결된 노드
			if(dp[current]!=0) {
				return dp[current];
			}
			dp[current]=1;
			
			for(int child : graph.get(current)) {
				//parent와 child 같으면 안됨
				//순환 없고 부모는 무조건 하나
				if(parent != child) {
					dp[current] +=buildTree(child,current);
				}
			}
			return dp[current];
		}
}
