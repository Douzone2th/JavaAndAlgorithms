package weeks_12_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class programmers_carpet {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int brown = Integer.parseInt(stz.nextToken());
			int yellow = Integer.parseInt(stz.nextToken());
			int[] ary = solution(brown, yellow);
			for(int i = 0; i < ary.length; i++) {
				System.out.println(ary[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;
        for(int i = 1; i <= area; i++){
            int row = i;
            int col = area/row;
            if(row > col) continue;
            if((row-2)*(col-2)==yellow){
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
        }
        return answer;
    }
}
