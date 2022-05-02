package week_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_15900 {
	static int N;
	static ArrayList<ArrayList<Integer>> a;
	static int ans;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());

		a = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			a.add(new ArrayList<>());
		}
		
		// ����� ��������Ʈ ����.
		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			a.get(x).add(y);
			a.get(y).add(x);
		}

		ans = 0;
		visited = new boolean[N + 1];
		DFS(1, 0, visited);

		// ���� ��忡�� ��� ���� �������� ������ ���� ¦����
		// �����̰� �й��ϰ�, Ȧ���� �����̰� �¸��Ѵ�.
		bw.write((ans % 2 == 0) ? "No" : "Yes");
		bw.flush();
		bw.close();
		br.close();
	}

	public static void DFS(int node, int cnt, boolean[] visited) {
		visited[node] = true;

		for (int next : a.get(node)) {
			if (!visited[next]) {
				DFS(next, cnt + 1, visited);
			}
		}

		// Ư�� ��尡 ��Ʈ ��尡 �ƴϰ�, ����� ��������Ʈ�� ����� 1�̸�
		// �� ���� ���� �����.
		if (node != 1 && a.get(node).size() == 1) {
			ans += cnt;
		}
	}

}