package weeks_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1543번 문서검색
public class Baekjoon_1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(br.readLine());
        String s = br.readLine();
        int cnt = 0;

        while (true) {
            if (s.length() > sb.length()) {
                break;
            } else {
                boolean flag = true;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) != sb.charAt(i)) {
                        sb.deleteCharAt(0);
                        flag =false;
                        break;
                    }
                }
                if (!flag){
                    continue;
                }
                sb.delete(0, s.length());
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
