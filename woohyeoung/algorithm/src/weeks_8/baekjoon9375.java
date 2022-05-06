package weeks_8_해시맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class baekjoon9375 {
	static BufferedReader br = null;
	public static void main(String[] args) {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			int[] answer = new int[testcase];
			for(int i = 0; i < testcase; i++) {
				int num = Integer.parseInt(br.readLine());
				answer[i] = clothes(num);
			}
			for(int i : answer) System.out.println(i);
		} catch (IOException ie) { ie.printStackTrace();
		} finally { try { br.close(); } catch (IOException ie) { ie.printStackTrace(); } }
	}
	public static int clothes(int num) {
		HashMap<String, Integer> map = new HashMap<>();
		int sol = 1;
		try {
			for(int i = 0; i < num; i++) {
				String[] str = br.readLine().split(" ");
				map.put(str[1], map.getOrDefault(str[1], 0) + 1);
			}
			Iterator<Integer> it = map.values().iterator();
			while(it.hasNext()) {
				sol *= it.next()+1;
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		return sol-1;
	}
}
