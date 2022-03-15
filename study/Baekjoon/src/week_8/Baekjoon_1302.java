package week_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;
public class Baekjoon_1302{
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 오늘 하루 동안 팔린 책의 개수 N 입력
        String name; // 입력할 책 제목 변수
		ArrayList<String> list = new ArrayList<String>(); // 팔린 책들 담을 리스트
		ArrayList<String> result = new ArrayList<String>(); // 가장 많이 팔린 책들의 제목을 담을 리스트
		
		// 팔린 책들 입력
		for (int i = 0; i < N; i++) {
			name = br.readLine();
			list.add(name);
		}
		
		// 팔린 책들의 제목과 개수를 담을 hashmap
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 팔린 책들의 리스트에서 hashmap에 제목과 개수를 입력하는 반복문
		for (String str : list) {
			Integer count = map.get(str);
			if(count == null) {map.put(str, 1);}
            else {map.put(str, count + 1);}
		}
		
		// 가장 많이 팔린 책들 찾아서 리스트에 넣기
		Integer maxValue = Collections.max(map.values());
		
		// value로 key 찾아 가장 많이 팔린 책들의 제목을 담을 리스트에 넣기
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String,Integer> entry : entrySet) {
			if (entry.getValue() == maxValue) {result.add(entry.getKey());}
		}
		
		// 가장 많이 팔린 책이 여러 개일 경우에 사전 순으로 가장 앞서는 제목을 출력
		result.sort(Comparator.naturalOrder());
		System.out.println(result.get(0));		
	}
}