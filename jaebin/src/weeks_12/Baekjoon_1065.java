package weeks_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 1065번 한수
public class Baekjoon_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(d(n));
    }
    public static int d(int n) {
        int cnt = 0;
        if (n < 100) {
            return n;
        } else {
            cnt = 99;
            if (n == 100) {
                return cnt;
            }
            if (n == 1000) {
                n = 999;
            }
            for (int i = 100; i <= n; i++) {
                int h = i / 100;
                int t = (i / 10) % 10;
                int o = i % 10;

                if ((h - t) == (t - o)) {
                    cnt++;
                    continue;
                }
            }
        }
        return cnt;
    }
}
