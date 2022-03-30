package Baekjun;

import java.util.*;

public class Baekjoon_11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[] arr = new int[n];
		int r = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = n-1; i >= 0; i--) {
			if(k >= arr[i]) {
				r += (k/arr[i]);
				k %= arr[i];
			}
		}
		System.out.println(r);

	}

}
