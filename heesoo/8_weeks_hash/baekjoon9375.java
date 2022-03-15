import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class baekjoon9375 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] result = new int[N];

		for (int i = 0; i < N; i++) {
			HashMap<String, Integer> map = new HashMap();
			int count = Integer.parseInt(br.readLine());
			for (int j = 0; j < count; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				String type = st.nextToken();
				if (map.containsKey(type)) {
					map.put(type, map.get(type) + 1);
				} else {
					map.put(type, 1);
				}

			}

			int mul = 1;

			Iterator<String> keys = map.keySet().iterator();
			while (keys.hasNext()) {
				String key = keys.next();
				mul *= map.get(key) + 1; //옷 안입을 경우 포함
			}
			result[i] = mul;

		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] - 1);
		}
	}
}
