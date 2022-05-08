package weeks_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baekjoon1620 {
	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] testcase = br.readLine().split(" ");
		int n = Integer.parseInt(testcase[0]);
		int q = Integer.parseInt(testcase[1]);
		testcase = new String[n];
		for(int i = 0; i < n; i++) {
			String nm = br.readLine();
			map.put(nm, i);
			testcase[i] = nm;
		}
		for(int i = 0; i < q; i++) {
			String qu = br.readLine();
			try {
				int x = Integer.parseInt(qu);
				sb.append(testcase[x-1]);
			} catch (NumberFormatException ne) {
				sb.append(map.get(qu)+1);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
