package weeks_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1913 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			int ans = Integer.parseInt(br.readLine());
			StringBuilder sb = solution(testcase, ans);
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static StringBuilder solution(int testcase, int ans){
		int[][] arr = new int[testcase][testcase];
		int value = 1;
		int x = testcase/2, y = testcase/2;
		int length = 1;
		while(true){
			for(int i = 0; i < length; i++){
				arr[x--][y] = value++;
			}
			if(value - 1 == testcase*testcase) break;
			for(int i = 0; i < length; i++){
				arr[x][y++] = value++;
			}
			length++;
			for(int i = 0; i < length; i++){
				arr[x++][y] = value++;
			}
			for(int i = 0; i < length; i++){
				arr[x][y--] = value++;
			}
			length++;
		}
		int ansX = 0, ansY = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(ans == arr[i][j]) {
					ansX= i+1; ansY = j+1;
				}
				sb.append(arr[i][j]).append(' ');
			}
			sb.append('\n');
		}
		sb.append(ansX + " ").append(ansY);
		return sb;
	}
}
