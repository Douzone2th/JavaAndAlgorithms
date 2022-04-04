package Baekjun;

import java.util.*;

public class Baekjoon_16953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		int count=0;
		
		while(true) {
			if(b==a) {
				count++;
				break;
			}
			
			if(b<a) {
				count=-1;
				break;
			}
			
			if(b%2==0) {
				b/=2;
			}else if(b%10==1) {
				b/=10;
			}else {
				count=-1;
				break;
			}
			count++;
		}
		
		System.out.println(count);
	}

}
