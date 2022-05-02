package week_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1094 {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = Integer.parseInt(br.readLine());
		int num = 64;
		int count = 0;
		
		while(result>0) {
			
			if(num>result) {
				num /= 2;
			}
			else {
				count++;
				result -= num;
			}
		}
		
		System.out.println(count);
		
		
	}
}
