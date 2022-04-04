package Baekjun;

import java.util.*;

public class Baekjoon_1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			String s = sc.next();
			for(int j=0; j<m; j++) {
				a[i][j] = s.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<n; i++) {
			String s = sc.next();
			for(int j=0; j<m; j++) {
				b[i][j] = s.charAt(j)-'0';
			}
		}
		
		for (int i = 0; i <= n-3; i++) {
			for (int j = 0; j <= m-3; j++) {
				if(a[i][j]==b[i][j]) {
					continue;
				}
				count++;
				for(int ii=i; ii<i+3; ii++) {
					for(int jj=j; jj<j+3; jj++) {
						a[ii][jj] = a[ii][jj]==0 ? 1 : 0;
					}
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(a[i][j]!=b[i][j]) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(count);
	}

}
