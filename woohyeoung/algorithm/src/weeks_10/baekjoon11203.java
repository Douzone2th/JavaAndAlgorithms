package weeks_10_트리_백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11203 {
	public static void main(String[] args) {
		BufferedReader br = null;
		long testcase = 0;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String[] strAry = br.readLine().split(" ");
			if(strAry.length > 1) {
				testcase = Integer.parseInt(strAry[0]);
				testcase = solution(testcase, strAry[1]);
			}else {
				testcase = (long)Math.pow(2, Integer.parseInt(strAry[0])+1)-1;
			}
			System.out.println(testcase);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	public static long solution(long testcase, String str) {
		long num = (long)Math.pow(2, testcase +1);
		int k = 1;
		String[] strAry = str.split("");
		for(int i = 0; i < strAry.length; i++) {
			if(strAry[i].equals("L")) k *= 2;
			else k = (k*2) +1;
		}
		return num - k;
	}
}


