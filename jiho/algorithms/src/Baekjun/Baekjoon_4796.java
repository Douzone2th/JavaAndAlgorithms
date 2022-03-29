package Baekjun;

import java.util.*;

public class Baekjoon_4796 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;;i++) {
			int l = sc.nextInt();
			int p = sc.nextInt();
			int v = sc.nextInt();
			
			if((l+p+v)==0) {
				break;
			}
			
			int t1 = v / p;
			int t2 = v % p;
			int r = (t1*l) + Math.min(t2, l);
			System.out.println("Case "+i+": "+r);
		}
	}
}
