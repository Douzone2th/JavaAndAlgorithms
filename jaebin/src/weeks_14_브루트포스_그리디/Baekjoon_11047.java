package weeks_14_브루트포스_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 11047번 동전 0
//분류 : 그리디
public class Baekjoon_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= k) {
                cnt += (k / arr[i]);
                k %= arr[i];
            }
        }

        System.out.println(cnt);
    }
}
