package weeks_12_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class programmers_findPrimeNumber {
	static HashSet<Integer> set = new HashSet<Integer>();
	static char[] chAry;
	static boolean[] visitied;
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int k = solution(br.readLine());
			System.out.println(k);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int solution(String numbers) {
		chAry = numbers.toCharArray();
		visitied = new boolean[numbers.length()];
		mine("", 0);
		int answer = set.size();
		return answer;
	}
	public static void mine(String str, int index) {
		int num = 0;
		if(str != "") {
			num = Integer.parseInt(str);
			if(check(num)) set.add(num);
		}
		if(index == chAry.length) return;
		
		for(int i = 0; i < chAry.length; i++) {
			if(visitied[i]) continue;
			visitied[i] = true;
			mine(str+chAry[i], index+1);
			visitied[i] = false;
		}
	}
	public static boolean check(int n) {
		if(n < 2) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) return false;
		}
		return true;
	}
}
