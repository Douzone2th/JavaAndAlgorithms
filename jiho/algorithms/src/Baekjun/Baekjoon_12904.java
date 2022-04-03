package Baekjun;

import java.util.*;

public class Baekjoon_12904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		StringBuilder sb = new StringBuilder(t);
		int r = 1;
		
		while(true) {
			if(sb.length()<=s.length()) {
				if(!sb.toString().equals(s)) {
					r=0;
				}
				break;
			}
			
			int l = sb.length();
			char ch = sb.charAt(l-1);
			if(ch=='A') {
				sb = new StringBuilder(sb.substring(0, l-1));
				continue;
			}
			
			if(ch=='B') {
				sb = new StringBuilder(sb.substring(0, l-1));
				sb = sb.reverse();
				continue;
			}
		}
		
		System.out.println(r);
	}

}
