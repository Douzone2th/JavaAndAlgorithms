package week_16;
import java.util.*;

public class Baekjoon_2606 {
	static int map[][];
	static boolean visit[];
	static int n, m, v;
	static int count = 0;
	
	public static int dfs(int i) {
		visit[i] = true;
		
		for(int j=1; j<=n; j++) {
			if(map[i][j] == 1 && visit[j] == false) {
				count ++;
				dfs(j);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();	// ��ǻ�� ��(����)
		m = scan.nextInt();	// ����� ��ǻ�� ���� ��(����)
		v = 1;	// Ž�� ������ ������ ��ȣ
		map = new int[n+1][n+1];	// �� ������ Ž�� ��θ� ������ �迭
		visit = new boolean[n+1];	// ������ Ž�� ���� üũ
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			map[a][b] = map[b][a]= 1;
		}
		
		System.out.println(dfs(1));
		scan.close();
	}
}