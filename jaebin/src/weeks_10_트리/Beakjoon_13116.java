package weeks_10_트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//백준 알고리즘 13116번 : 30번
public class Beakjoon_13116 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            List<Integer> listA = new ArrayList<>();
            List<Integer> listB = new ArrayList<>();
            int result = 1;

            while (true) {
                if (A >= 1) {
                    listA.add(A);
                } else {
                    break;
                }
                A /= 2;
            }
            while (true) {
                if (B >= 1) {
                    listB.add(B);
                } else {
                    break;
                }
                 B /= 2;
            }

            loop:
            for (int j = 0; j < listA.size(); j++) {
                for (int k = 0; k < listB.size(); k++) {
                    if (listA.get(j).equals(listB.get(k))) {
                        if (result < listA.get(j)) {
                            result = listA.get(j);
                        }
                    }
                }
            }
            result *= 10;
            System.out.println(result);
        }
    }
}
