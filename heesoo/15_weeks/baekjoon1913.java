import java.io.*;

public class baekjoon1913 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());
		solve(n,t); 
		
	}

	// 안쪽에서 바깥쪽으로 돌기
	static void solve(int n, int t){
		int[][] map = new int[n][n];
		int value =1;
		
		int x = n/2, y=n/2;
		
		int limit =1;
		while(true) {
			for(int i=0; i<limit; i++) {
				map[y--][x] = value++;
			}
			if(value-1 == n*n) break;
			for(int i=0; i<limit; i++) {
				map[y][x++] = value++;
			}
			
			limit++;
			for(int i=0; i<limit; i++) {
				map[y++][x] = value++;
			}
			
			for(int i=0; i<limit; i++) {
				map[y][x--] = value++;
			}
			limit++;
		}
		
		StringBuilder sb = new StringBuilder();
		int tx=0, ty=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(t==map[i][j]) {
					ty=i+1;
					tx=j+1;
				}
				sb.append(map[i][j] +" ");
			}
			sb.append("\n");
		}
		sb.append(ty+" "+tx);
		System.out.println(sb.toString());
	}
	
}