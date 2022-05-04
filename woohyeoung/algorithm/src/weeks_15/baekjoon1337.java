package weeks_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon1337 {
	static int[] ary;
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			ary = new int[testcase];
			for(int i = 0; i < testcase; i++) {
				ary[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(ary);
			System.out.println(solution(testcase));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int solution(int testcase) {
		int size = 0;
        int count = 0;
        int end = testcase<5 ? 1 : testcase;

        for(int i = 0; i <end;i++){
            int a = ary[i]+4;
            for(int j = 0; j < testcase-i;j++){
                int b = ary[i+j];
                if(a >= b){
                	count++;
                } else break;
            }
            if(count>size) size = count;
            count=0;
        }
		return 5 - size;
	}
}
