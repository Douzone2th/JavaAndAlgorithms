package weeks_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1094 {
	static int testcase = 0;
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			testcase = Integer.parseInt(br.readLine());
			System.out.println(solution(64, 0));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int solution(int length, int cut) {
		while (length > 0) {
			if (testcase < length)
				length /= 2;
			else {
				cut++;
				testcase -= length;
			}
		}
		return cut;
	}
}
