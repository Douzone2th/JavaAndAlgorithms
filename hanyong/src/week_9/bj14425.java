package week_9;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class bj14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), i);
        }
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (map.get(str) != null) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
