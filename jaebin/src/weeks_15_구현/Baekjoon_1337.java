package weeks_15_구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

//백준 알고리즘 1337번 올바른 배열
//분류 : 구현, 정렬
public class Baekjoon_1337 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        long arr[] = new long[tc];
        ArrayList<Long> list = new ArrayList<>();

        int cnt = 5;
        long min = 999999999;

        for (int i = 0; i < tc; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (long j = arr[i]; j < arr[i] + 5; j++) {
                list.add(j);
            }

            for (int j = i; j < arr.length; j++) {
                for (int k = 0; k < list.size(); k++) {
                    if (arr[j] == list.get(k)) {
                        cnt--;
                    }
                }
            }
            min = Math.min(min, cnt);
            list.clear();
            cnt = 5;
        }
        System.out.println(min);
    }
}
