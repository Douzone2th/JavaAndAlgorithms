package weeks_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 알고리즘 2805번 나무자르기
public class Baekjoon_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        Arrays.sort(arr);
        //Upper Bound
        int min = 0;
        int max = arr[arr.length - 1];
        //min이 max를 넘어가면 종료
        while (min < max) {
            int mid = (min + max) / 2;
            long sum = 0;

            for (int j = 0; j < arr.length; j++) {
                // 양수만 합산 , 자르고 남은것만 합산
                if (arr[j] - mid > 0) {
                    sum += arr[j] - mid;
                }
            }
            if (sum < m) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);

    }
}
