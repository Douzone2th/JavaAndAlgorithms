package weeks_11_재귀_분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 알고리즘 18511번 : 큰 수 구성하기
//분류 : 재귀, 브루트포스
public class Baekjoon_18511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a[] = new int[k];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a.length; i++) {
            //1 5 7
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int max = Integer.MIN_VALUE;
        //657, a, i==0, max
        max = rec(n, a, max, 0);
        System.out.println(max);
    }

    public static int rec(int n, int[] a, int max, int now) {
        if (now > n) return max;
        if (now > max) {
            max = now;
        }
        for (int i = a.length - 1; i >= 0; i--) {
            max = rec(n, a, max, now * 10 + a[i]);
        }
        return max;
    }
}
