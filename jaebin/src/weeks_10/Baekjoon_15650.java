package weeks_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 15650번 : N 과 M (2)
public class Baekjoon_15650 {
    public static int n;
    public static int m;
        public static int result[];
        public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        result = new int[m];
        sb = new StringBuilder();

        if (m == 1) {
            for (int i = 1; i <= n; i++) {
                sb.append(i).append('\n');
            }
        } else {
            dfs(1,0);
        }
        System.out.println(sb);
    }
    //dfs
    public static void dfs(int root, int depth) {
        //깊이가 m일 경우 출력
        if (depth == m){
           for (int item : result){
               sb.append(item).append(' ');
           }
            sb.append("\n");
            return;
        }

        for (int i = root; i <= n; i++) {
            result[depth] = i;
            dfs(i+1,depth+1);
        }

    }
}
