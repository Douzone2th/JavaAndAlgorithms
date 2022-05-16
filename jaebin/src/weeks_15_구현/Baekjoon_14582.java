package weeks_15_구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 알고리즘 14582번 오늘도 졌다.
//분류 : 구현
public class Baekjoon_14582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //짝수 울림 , 홀수 스타트링크
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int idx = 0;
        int arr[] = new int[9];
        int arr2[] = new int[9];

        int sum1 = 0;
        int sum2 = 0;
        boolean flag = false;

        while (st.hasMoreTokens()) {
            arr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }
        idx = 0;
        while (st2.hasMoreTokens()) {
            arr2[idx] = Integer.parseInt(st2.nextToken());
            idx++;
        }

        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
            if (sum1 > sum2) {
                flag = true;
                break;
            }
            sum2 += arr2[i];
        }

        if (flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
