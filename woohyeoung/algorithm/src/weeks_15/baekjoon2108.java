package weeks_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class baekjoon2108 {
	static ArrayList<Integer> arr = new ArrayList<>();
	public static void main(String[] args) {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			for(int i = 0; i < testcase; i++) {
				arr.add(Integer.parseInt(br.readLine()));
			}
			Collections.sort(arr);
			sb.append(avg(testcase)).append('\n');
			sb.append(centerVal()).append('\n');
			sb.append(minVal()).append('\n');
			sb.append(range()).append('\n');
			System.out.println(sb);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	public static int avg(int testcase) {
		double result = 0;
		for(int i : arr) result += i;
		return (int)Math.round(result/testcase);
	}
	public static int centerVal() {
		return arr.get(arr.size()/2);
	}
	public static int minVal() {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> ary = new ArrayList<Integer>();
		int result = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(map.containsKey(arr.get(i))) map.put(arr.get(i), map.get(arr.get(i))+ 1);
			else map.put(arr.get(i), 1);
		}
		for(int i : map.values()) result = Math.max(result, i);
		for(int i : map.keySet()) {
			if(map.get(i) == result) ary.add(i);
		}
		Collections.sort(ary);
		if(ary.size() >= 2) result = ary.get(1);
		else result = ary.get(0);
		return result;
	}
	public static int range() {
		return arr.get(arr.size()-1) - arr.get(0);
	}
}
