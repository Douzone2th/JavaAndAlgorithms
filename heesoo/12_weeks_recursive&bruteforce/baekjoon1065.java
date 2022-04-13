import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (i > 0 && i < 10) {
				count++;
			} else {
				count += numCheck(i);
			}
		}
		System.out.println(count);
	}

	static int numCheck(int n) {
		String num = Integer.toString(n);
		int len = num.length();
		int[] sub = new int[len - 1];

		for (int i = 0; i < len - 1; i++) {
			// System.out.println(num.charAt(i)+" "+num.charAt(i+1));
			sub[i] = Integer.valueOf(Character.toString(num.charAt(i)))
					- Integer.valueOf(Character.toString(num.charAt(i + 1)));
		}
		boolean flag = false;
		if (sub.length == 1) {
			flag = true;
		} else {
			for (int i = 0; i < sub.length - 1; i++) {
				if (sub[i] == sub[i + 1]) {

					flag = true;
				} else {
					flag = false;
					break;
				}
			}
		}
		if (flag)
			return 1;
		else
			return 0;
	}

}

