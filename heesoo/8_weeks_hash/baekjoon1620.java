import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baekjonn1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> map = new HashMap<>();
		String[] pocketmon = new String[N];
		for (int i = 1; i < N + 1; i++) {
			String name = br.readLine();
			map.put(name, i);
			pocketmon[i - 1] = name;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			if (str.matches("[+-]?\\d*(\\.\\d+)?")) { //숫자일 경우 확인하는 정규표현식
				sb.append(pocketmon[Integer.parseInt(str) - 1] + "\n");

			} else {
				sb.append(Integer.toString(map.get(str)) + "\n");
			}
		}
		System.out.println(sb);
	}
}
