import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon18511 {
	static int[] arr;
	static int N;
	static int K;
	static StringBuilder sb = new StringBuilder();
	static int ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < K; i++) {
			arr[i] = (Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		
		
		recursive(0);  
	}
	
	
	
	static void recursive(int now) {
		if(now>N) return;
		if(ans<now) ans = now;
		
		for (int i = K-1; i >= 0; i--){
			recursive(now*10+arr[i]);
		}
	}
}
