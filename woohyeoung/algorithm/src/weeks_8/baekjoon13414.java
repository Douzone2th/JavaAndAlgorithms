package weeks_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class baekjoon13414 {
	public static void main(String[] args) {
		BufferedReader br = null;
		Set<String> set = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer testcase = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(testcase.nextToken());
			int len = Integer.parseInt(testcase.nextToken());
			for(int i = 0; i < len; i++) {
				String str = br.readLine();
				if(set.contains(str)) set.remove(str);
				set.add(str);
			}
			Iterator<String> it = set.iterator();
			while(it.hasNext()) {
				sb.append(it.next()+"\n");
				if(--num == 0) break;
			}
			System.out.println(sb);
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try { br.close();} catch (IOException e) {e.printStackTrace();}
		}
	}
}