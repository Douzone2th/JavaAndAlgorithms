package week_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_13116 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(tree(A,B)) + "\n");
		}
		bw.flush();
		bw.close();
		
	}
	
	public static int tree(int A, int B) {
		
		int result = 0;
		
		// A가 B보다 클 때
		if(A > B) {
			while(true) {
				if(A-B < B) break; // A에서 B를 뺀 값이 B보다 작아질때 까지 A를 2로 나눈다(부모 노드로 이동시킨다) -> 높이의 차를 1이하로 만들어준다.(레벨의 차이를 1이하로 만들어준다)
				A /= 2;
			}
		}
		// B가 A보다 클 때
		else {
			while(true) {
				if(B - A < A) break;
				B /= 2;
			}
		}
		
		// 레벨의 차가 1이하일 때, 더 큰 값부터 2로 나누면서(부모 노드로 이동) 값이 같아지면 같은 값의 부모노드를 발견한 것이다.
		// ex) 13, 14 일때 13/2 = 6, 14/2 = 7, 6/2 = 3, 7/2 = 3 이므로 3이 같은 부모의 노드라고 할 수 있다.
		while (A != B) {
			if(A > B) {
				A /= 2;
				if(A==B) break;
				B /= 2;
			}
			else {
				B /= 2;
				if(A==B) break;
				A /= 2;
			}
		}
		
		result = A*10;
		
		return result;
	}
}
