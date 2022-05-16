package weeks_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2607 {
	static int count = 0;
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			String name = br.readLine();
			for (int i = 0; i < testcase-1; i++) {
				char[] ch = br.readLine().toCharArray();
				char[] nm = name.toCharArray();
				solution(nm, ch);
			}
			System.out.println(count);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	public static void solution(char[] name, char[] ch) {
		int answer = 0;

		for(int j = 0; j < ch.length; j++) {
			for(int i = 0;  i < name.length; i++) {
				if(name[i] == ch[j]) {
					name[i] = '1';
					ch[j] = '2';
					answer++;
					break;
				}
			}
		}
		if( ( answer>=name.length-1 && name.length>=ch.length ) 
				|| ( answer >= ch.length-1 && ch.length>=name.length ) ) 
			count++;
	}
}
