package Baekjun;

import java.util.*;

public class Baekjoon_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), r=0;
		
		for (int i = 0; i < n; i++) {
			boolean[] b = new boolean[26];
			String str = sc.next();
			int t = 0;
			boolean b2 = true;
			for (int j = 0; j < str.length(); j++) {
				int t2 = str.charAt(j)-'a';
				if(t!=t2 && b[t2]==true) {
					b2=false;
					break;
				}
				b[t2]=true;
				t=t2;
			}
			if(b2) {
				r++;
			}
		}
		System.out.println(r);
	}
}
