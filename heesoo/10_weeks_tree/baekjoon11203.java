import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11203 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		String str = "";
		if (st.hasMoreTokens()) {
			str = st.nextToken();
		}

		long totNode = 1;
		for (int i = 0; i < H + 1; i++) {
			totNode *= 2;
		}

		totNode = totNode - 1;

		int position = 1;

		if (str != null && str != "") {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'L') {
					position = 2 * position;
				} else if (str.charAt(i) == 'R') {
					position = 2 * position + 1;
				}
			}
		}

		System.out.println(totNode - position + 1);
	}
}
