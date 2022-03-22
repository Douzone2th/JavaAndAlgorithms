import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = br.readLine();
		}
		
		String[] arr = new String[M];
		for (int i = 0; i < M; i++) {
			arr[i] = br.readLine();
		}
		
		int cnt =0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(str[i].equals(arr[j]))
					cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
