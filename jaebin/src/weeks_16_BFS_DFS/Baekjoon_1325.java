package weeks_16_BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//백준 알고리즘 1325번 효율적인 해킹
public class Baekjoon_1325 {

    public static boolean visited[];
    public static int ans[];
    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ans = new int[n + 1];
        list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 단방향 연결
            list.get(a).add(b);
        }

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            visited[0] = true;
            bfs(i);
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, ans[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (max == ans[i]){
                sb.append(i+" ");
            }
        }
        System.out.println(sb.toString().trim());
    }

    public static void bfs(int v) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int num = queue.poll();

            for (int i = 0; i < list.get(num).size(); i++) {
                int next = list.get(num).get(i);
                if (!visited[next]) {
                    ans[next]++;
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}
