import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon14582 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] j = new int[9];
		int[] g = new int[9];

		int sum1 = 0;
		int sum2 = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < 9; i++) {
			j[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 9; i++) {
			g[i] = Integer.parseInt(st.nextToken());
		}

		int count = 0;
		int i = 0;
		while (i < 9) {
			sum1 += j[i];

			if (sum1 > sum2) {
				count++;
			}
			sum2 += g[i];
			i++;
		}

		if (sum1 < sum2 && count > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
