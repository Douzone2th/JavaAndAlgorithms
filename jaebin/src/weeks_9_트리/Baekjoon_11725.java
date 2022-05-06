package weeks_9_트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//백준 알고리즘 11725번 : 트리의 부모찾기
public class Baekjoon_11725 {
    static int n;
    //배열의 원소가 리스트
    static ArrayList<Integer>[] list;
    // 각 번호의 노드의 부모 노드 번호
    static int[] parents;
    // 각 번호의 노드를 방문했는지
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        list = new ArrayList[n + 1];
        parents = new int[n + 1];
        check = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<Integer>();
        }
        // u-v 연결
        for (int j = 1; j < n; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }
        // 1번부터 탐색하지 않았다면 dfs
        for (int k = 1; k <= n; k++) {
            if (!check[k]) {
                dfs(k);
            }
        }
        // 2번노드 부터 자기 부모 노드 번호 출력
        for (int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }
    }
    //dfs
    public static void dfs(int v) {
        // 방문했다면 빠져나옴
        if (check[v]) {
            return;
        }
        // 방문 안해서 방문으로 바꿈
        check[v] = true;
        // 자식노드들도 방문해야함.
        // 방문 하고 현재 노드 번호를 자식 노드 번호의 원소값으로 함.
        for (int vv : list[v]) {
            if (!check[vv]) {
                parents[vv] = v;
                dfs(vv);
            }
        }
    }
}