package week_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		ArrayList<Integer> check = new ArrayList<Integer>();
		int k; 
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for (int key : arr) {
			Integer count = map.get(key);
			if (count == null) {
				map.put(key, 1);
			} else {
				map.put(key, count + 1);
			}
		}		
		int maxValue = Collections.max(map.values());
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue()==maxValue) {
				check.add(m.getKey());
			}
		}
		Collections.sort(check);
		if (check.size() >= 2) {
			k = check.get(1);
		}
		else {
			k = check.get(0);
		}		
		System.out.println(sp(arr) + "\n" + arr[(arr.length) / 2] + "\n" + k + "\n" + (arr[arr.length-1]-arr[0]));

	}

	public static int sp(int[] arr) {

		float sum = Arrays.stream(arr).sum();
		float sp = sum / arr.length;
		return (int)Math.round(sp);
	}


}
