package weeks_16_BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;

//백준 알고리즘 2606번 바이러스
//분류 : BFS
public class Baekjoon_2606 {

    public static boolean visited[];
    public static LinkedList<LinkedList<Integer>> list;
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        StringTokenizer st;
        visited = new boolean[a + 1];
        list = new LinkedList<>();

        for (int i = 0; i <= a; i++) {
            list.offer(new LinkedList<Integer>());
        }

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x).add(y);
            list.get(y).add(x);
        }
        bfs(1);
    }

    public static void bfs(int v) {
        LinkedList<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.offer(v);
        HashSet<Integer> set = new HashSet<>();

        while (!queue.isEmpty()) {
            int num = queue.poll();
            set.add(num);

            for (int i = 0; i < list.get(num).size(); i++) {
                int next = list.get(num).get(i);
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
        System.out.println(set.size()-1);
    }
}
