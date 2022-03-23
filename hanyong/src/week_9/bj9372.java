package week_9;

import java.io.*;
import java.util.*;

public class bj9372 {
    static int N,M,result;
    static boolean visit[];
    static int arr[][];
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            result = 0;

            arr = new int[N+1][N+1];
            visit = new boolean[N+1];

            for(int j=0; j<M; j++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                arr[u][v] = 1;
                arr[v][u] = 1;
            }
            bfs();
            System.out.println(result-1);
        }
    }
    private static void bfs() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        visit[1] = true;
        while(!queue.isEmpty()) {
            result++;
            int val = queue.poll();
            for(int i=1; i<=N; i++) {
                if(arr[val][i]!=0 && !visit[i]) {
                    visit[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}



