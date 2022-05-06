package weeks_12_완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1065 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			System.out.println(count(testcase));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int count(int n) {
		int cnt = 0;
		if(n < 100) return n;
		else {
			cnt = 99;
			if(n == 1000) n = 999;
			for(int i =100; i <= n; i++) {
				int bek = i / 100;
				int sib = (i/10)%10;
				int il = i % 10;
				
				if((bek-sib) == (sib - il)) cnt++;
			}
		}
		return cnt;
	}
}
