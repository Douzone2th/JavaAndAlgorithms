import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon14244 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 노드 개수
		int m = Integer.parseInt(st.nextToken()); // 리프 개수

		System.out.println(n + " " + m);
		int leaf = 0;
		if (m == 2) {
			leaf = 1; // 시작 노드 (0번째) 리프로 포함
		}

		int last_leaf = 0;
		for (int i = 1; i < n; i++) {
			if (m > leaf) {
				System.out.println(0 + " " + i);
				leaf++;
			} else {
				System.out.println(last_leaf + " " + i);
			}
			last_leaf = i;
		}

	}
}
