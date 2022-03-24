import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon9372 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

		for (int i = 0; i < T; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 국가의 수 => 정점의 개수
			int M = Integer.parseInt(st.nextToken()); // 비행기의 종류 => 간선의 개수

			for (int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
			}

			System.out.println(N - 1);  // 최소 스패팅트리 성질에 의해	간선 개수 = 정점 개수 - 1

		}

	}
}
