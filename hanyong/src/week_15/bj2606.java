package week_15;

import java.io.*;
import java.util.*;

public class bj2606 {
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int a[][] = new int[n+1][n+1];
        boolean check[] = new boolean[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<e;i++) {
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            a[v1][v2] = 1;
            a[v2][v1] = 1;
        }
        dfs(a,check,1);
        System.out.println(cnt-1);
    }
    static void dfs(int[][] a, boolean[] check, int v) {
        if(check[v]==true){
            return;
        }
        check[v] = true;
        cnt++;
        for(int i=0;i<a[v].length;i++) {
            if(a[v][i]==1 && !check[i])
                dfs(a,check,i);
        }
    }

}