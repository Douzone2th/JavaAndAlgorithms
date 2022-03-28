import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		StringBuilder sb = new StringBuilder();
		int n, m;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			for (int i = 0; i < testcase; i++) {
				stz = new StringTokenizer(br.readLine(), " ");
				n = Integer.parseInt(stz.nextToken());
				m = Integer.parseInt(stz.nextToken());
				sb.append(solution(n, m)).append('\n');
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int solution(int n, int m) {
		int minNum = Math.min(n, m);
		if (minNum == n) {
			while (true) {
				if (m - n < n) break;
				m /= 2;
			}
		} else {
			while (true) {
				if (n - m < m) break;
				n /= 2;
			}
		}
		while (n != m) {
			if (n > m) {
				n /= 2;
				if (n == m) break;
				m /= 2;
			} else {
				m /= 2;
				if (n == m) break;
				n /= 2;
			}
		}
		return n * 10;
	}
}