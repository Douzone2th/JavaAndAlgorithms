package weeks_9_트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 14244번: 트리만들기
//분류 : 트리
public class Baekjoon_14244 {
    /**
     * 최상위 노드 : root 노드
     * 자식노드가 없는 노드 : leaf 노드
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stz.nextToken());
        int m = Integer.parseInt(stz.nextToken());

        for (int i = 0; i < m - 1; i++) System.out.println(i + " " + (m - 1));
        for (int i = m; i < n; i++) System.out.println((i - 1) + " " + i);

    }
}
