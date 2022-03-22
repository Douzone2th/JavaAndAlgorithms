import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(stz.nextToken());
			int m = Integer.parseInt(stz.nextToken());
			int leaf = 0;
			if(m == 2) leaf = 1;
			int num = 0;
			for(int i = 1; i < n; i++) {
				if(m > leaf) {
					sb.append(0).append(" ").append(i).append("\n");
					leaf++;
				}else sb.append(num).append(" ").append(i).append("\n");
				num = i;
			}
			sb.deleteCharAt(sb.length()-1);
			System.out.println(sb);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
