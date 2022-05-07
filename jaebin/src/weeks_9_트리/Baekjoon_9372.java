package weeks_9_트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 9372번 : 상근이의 여행, 트리
public class Baekjoon_9372 {
    //모든 국가를 지나도록 이용할 수 있는 최소의 비행기의 갯수는 국가갯수-1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int ansArr[] = new int[num];
        for (int n = 0; n < num; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int countryNum = Integer.parseInt(st.nextToken());
            int planeNum = Integer.parseInt(st.nextToken());
            for (int i = 0; i < planeNum; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
            }
            ansArr[n] = countryNum - 1;
        }
        for (int i : ansArr)
            System.out.println(i);
    }
}
