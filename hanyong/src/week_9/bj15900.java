package week_9;

import java.io.*;
import java.util.*;

public class bj15900 {
    static ArrayList<ArrayList<Integer>> a;
    static int ans;

    public static void main(String[] args) throws IOException {
        boolean[] visited;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());

        a = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            a.add(new ArrayList<>());
        }

        for (int i = 0; i < num - 1; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            a.get(x).add(y);
            a.get(y).add(x);
        }

        ans = 0;
        visited = new boolean[num + 1];
        DFS(1, 0, visited);

        if(ans % 2 == 0){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }

    public static void DFS(int node, int cnt, boolean[] visited) {
        visited[node] = true;

        for (int next : a.get(node)) {
            if (!visited[next]) {
                DFS(next, cnt + 1, visited);
            }
        }

        if (node != 1 && a.get(node).size() == 1) {
            ans += cnt;
        }
    }

}