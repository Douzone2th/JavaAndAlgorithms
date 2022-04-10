package weeks_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon9372 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			for(int i = 0; i <testcase; i++) {
				StringTokenizer stz = new StringTokenizer(br.readLine(), " ");
				int n = Integer.parseInt(stz.nextToken());
				int m = Integer.parseInt(stz.nextToken());
				for(int j = 0; j < m; j++) br.readLine();
				System.out.println(n-1);
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
