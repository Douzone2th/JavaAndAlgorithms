package weeks_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1094번 막대기
public class Baekjoon_1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = 64;
        int temp = 0;
        int breakX = x;
        int cnt = 0;

        while (true) {
            if (temp == breakX) {
                break;
            }
            if (n > x) {
                n /= 2;
            } else {
                temp += n;
                cnt++;
                x -= n;
            }
        }
        System.out.println(cnt);
    }
}
