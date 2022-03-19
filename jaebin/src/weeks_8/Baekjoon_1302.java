package weeks_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//백준 알고리즘 1302번 : 베스트셀러
public class Baekjoon_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            int temp = 1;
            if (map.containsKey(s)) {
                temp = map.get(s);
                map.put(s, temp + 1);
            } else {
                map.put(s, temp);
            }
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // value값은 내림차순 정렬, value 값이 같으면 key값 오름차순정렬
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue() == o2.getValue()) return o1.getKey().compareTo(o2.getKey());
                else return o2.getValue() - o1.getValue();
            }
        });
        System.out.println(entryList.get(0).getKey());
    }
}
