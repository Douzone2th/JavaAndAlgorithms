import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class baekjoon5568 {
	static HashSet<String> set = new HashSet<>();
	static int[] arr;
	static int n, k;
	static boolean visited[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());

		arr = new int[n];
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		recursive(k, "");
		System.out.println(set.size());

	}

	static void recursive(int depth, String k) { // depth 재귀 도는 동안 카드 번호 k 더해준다.
		if (depth == 0) {
			set.add(k);
			return;
		}
		for (int i = 0; i < n; i++) {

			if (!visited[i]) { // 선택한 카드 제외
				visited[i] = true;
				recursive(depth - 1, k + Integer.toString(arr[i]));
				visited[i] = false;
			}
		}
	}
}
