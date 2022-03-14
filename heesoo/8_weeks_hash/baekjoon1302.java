import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class baekjoon1302 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		String[] book = new String[N];

		for (int i = 0; i < N; i++) {
			book[i] = br.readLine();
		}

		HashMap<String, Integer> map = new HashMap(); // key : 책이름, value : 책 개수

		for (int i = 0; i < N; i++) {

			if (map.containsKey(book[i])) {
				map.put(book[i], map.get(book[i]) + 1);

			} else {
				map.put(book[i], 1);
			}
		}

		List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				if (o2.getValue() == o1.getValue()) { //오름차순 정렬
					return o1.getKey().compareTo(o2.getKey());
				} else { // 내림차순 정렬
					return o2.getValue().compareTo(o1.getValue());
				}
			}

		});

		System.out.println(list.get(0).getKey());

	}
}
