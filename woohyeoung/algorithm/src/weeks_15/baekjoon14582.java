package weeks_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon14582 {
	static int[] teamA = new int[9];
	static int[] teamB = new int[9];
	static boolean flag = false;
	public static void main(String[] args) {
		BufferedReader br = null;
		StringTokenizer stz;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			stz = new StringTokenizer(br.readLine());
			int i = 0;
			while(stz.hasMoreTokens()) {
				teamA[i++] = Integer.parseInt(stz.nextToken());
			}
			stz = new StringTokenizer(br.readLine());
			i = 0;
			while(stz.hasMoreTokens()) {
				teamB[i++] = Integer.parseInt(stz.nextToken());
			}
			solution();
			String result = flag ? "Yes" : "No";
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void solution() {
		int aScore = 0, bScore = 0;
		for(int i = 0; i < 9; i++) {
			aScore += teamA[i];
			if(aScore > bScore) {
				flag = true;
				return;
			}
			bScore += teamB[i];
		}
	}
}
