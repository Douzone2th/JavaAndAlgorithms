package weeks_16_BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//백준 알고리즘 1697번 : 숨바꼭질
public class Baekjoon_1697 {

    public static int[] visited;
    public static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        visited = new int[100001];

        bfs(n, k);
        System.out.println(result - 1);
    }

    public static void bfs(int v, int k) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = 1;

        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (num == k) {
                result = visited[num];
                break;
            }
            // 3가지 규칙
            if (num - 1 >= 0 && visited[num - 1] == 0) {
                visited[num - 1] = visited[num] + 1;
                queue.offer(num - 1);
            }
            if (num + 1 <= 100000 && visited[num + 1] == 0) {
                visited[num + 1] = visited[num] + 1;
                queue.offer(num + 1);
            }
            if (2 * num <= 100000 && visited[2 * num] == 0) {
                visited[2 * num] = visited[num] + 1;
                queue.offer(2 * num);
            }
        }
    }
}
