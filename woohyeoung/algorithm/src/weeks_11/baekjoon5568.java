package weeks_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class baekjoon5568 {
	static String[] ary;
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			int product = Integer.parseInt(br.readLine());
			ary = new String[testcase];
			for(int i = 0; i < testcase; i++) {
				ary[i] = br.readLine();
			}
			System.out.println(solution(testcase, product));
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public static int solution(int testcase, int product) {
		Set<String> set = new HashSet<>();
		boolean[] visitied = new boolean[testcase];
		select(set, "", visitied, testcase, product);
		return set.size();
	}
	public static void select(Set<String> set, String k,  boolean[] visitied, int testcase, int product) {
		if(product == 0) {
			set.add(k);
			return;
		}
		for(int i = 0; i < testcase; i++) {
			if(!visitied[i]) {
				visitied[i] = true;
				select(set, k +ary[i], visitied, testcase, product-1);
				visitied[i] = false;
			}
		}
	}
}
