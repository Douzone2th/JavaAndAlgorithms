package week_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Baekjoon_13414 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int K = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int count = 0;
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		
		
		for (int i = 0; i < L; i++) {
			String str = br.readLine();
			if(set.contains(str)) {
				set.remove(str);
			}
			set.add(str);
		}
		
		Iterator<String> iter = set.iterator(); // set을 Iterator 안에 담기
		while(iter.hasNext()) {
			System.out.println(iter.next());
			count++;
			if(count == K) break;
		}
	}
}
