import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class baekjoon13116 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
				LinkedList<Integer> listA = new LinkedList<Integer>();
				LinkedList<Integer> listB = new LinkedList<Integer>();
				int result = 0;
				while (true) {
					if (a >= 1) {
						listA.add(a);
					}else {
						break;
					}
					a /= 2;
				}
				while (true) {
					if (b >= 1) {
						listB.add(b);
					} 
					else {
						break;
					}
					b /= 2;
				}

				while (true) {
					if (!listA.isEmpty() && listA.peek() > listB.peek()) {
						listA.poll();
					} else if (!listB.isEmpty() && listA.peek() < listB.peek()) {
						listB.poll();
					} else {
						result = listA.poll();
						break;

					}
				}
				sb.append(result * 10 + "\n");
			}

		System.out.println(sb);
	}
}
