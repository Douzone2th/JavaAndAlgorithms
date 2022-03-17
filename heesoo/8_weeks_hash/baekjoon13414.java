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
import java.util.StringTokenizer;

public class baekjoon13414 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < L; i++) {
			String stNum = br.readLine();
			map.put(stNum, i);  //key값이 이미 존재할 경우 해당 value로 변경
		}

		List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		if(K<list.size()) { //수강가능 인원이 대기명단보다 작을 경우
			for (int i = 0; i < K; i++) {
				System.out.println(list.get(i).getKey());
			}
		}else {//수강가능 인원이 대기명단보다 크거나 같을 경우
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getKey());
			}
		}

	}
}
