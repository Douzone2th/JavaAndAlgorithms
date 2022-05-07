package weeks_16_BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//백준 알고리즘 1260번 DFS와 BFS
public class Beakjoon_1260 {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static boolean[] visited;
    public static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        //n까지
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<Integer>());
        }
        //방문 여부
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //양방향 그래프
            list.get(a).add(b);
            list.get(b).add(a);
        }
        // 정렬
        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list.get(i));
        }

        dfs(v);
        visited = new boolean[n + 1];
        System.out.println(sb);
        sb = new StringBuilder();
        bfs(v);
        System.out.println(sb);
    }

    public static void dfs(int v) {
        visited[v] = true;
        sb.append(v+" ");
        for (int i = 0; i < list.get(v).size(); i++) {
            int num = list.get(v).get(i);
            if (visited[num] == false) {
                dfs(num);
            }
        }

    }

    public static void bfs(int v) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] =true;

        while (!queue.isEmpty()){
            // 빼면서 인접한것 넣기
            int num = queue.poll();
            sb.append(num+ " ");
            for (int i = 0; i < list.get(num).size(); i++) {
                int idx = list.get(num).get(i);
                if (visited[idx] == false){
                    visited[idx] = true;
                    queue.offer(idx);
                }
            }
        }
    }
}
