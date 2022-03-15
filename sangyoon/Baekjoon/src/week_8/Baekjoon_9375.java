package week_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon_9375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();  
		
		int t = Integer.parseInt(br.readLine()); // test case
		
		while(t-- >0) {
			
			HashMap<String, Integer> hm = new HashMap<>(); // 옷 종류와 개수
			
			int n = Integer.parseInt(br.readLine()); // 입력받을 옷의 개수
			
			while(n-- >0) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				st.nextToken(); // 옷 이름은 없어서 넘김
				String kind = st.nextToken(); // 옷 종류담을 변수
				
				if(hm.containsKey(kind)) { // 이미 해당 key가 있으면  value + 1 -> 해당 종류의 개수 + 1
					hm.put(kind, hm.get(kind) + 1);
				}
				else { // 해당 key가 없으면 해당 key 입력, value 에 1 입력 -> 해당 종류의 옷 1개 입력
					hm.put(kind, 1);
				}
			}
			
			int result = 1; // 곱해야해서 1로 초기화
			for (int value : hm.values()) {
				result *= (value + 1); // value에 +1을 하는 이유는 한 종류의 옷을 안입는 경우도 추가해야해서
			}
			sb.append(result -1).append('\n'); // 모든 종류의 옷을 안입으면 알몸이 되기 때문에 알몸인 경우는 제외해서 -1
		}
		System.out.println(sb);
	}
}

