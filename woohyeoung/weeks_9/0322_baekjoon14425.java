import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = null;
		HashSet<String> set = new HashSet<String>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(stz.nextToken());
			int m = Integer.parseInt(stz.nextToken());
			int count = 0;
			for(int i = 0; i < n; i++) {
				set.add(br.readLine());
			}
			for(int i = 0; i < m; i++) {
				if(set.contains(br.readLine())) count++;
			}
			System.out.println(count);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
