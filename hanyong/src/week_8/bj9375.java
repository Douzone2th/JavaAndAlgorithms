package week_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class bj9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int num = Integer.parseInt(br.readLine());
            for (int j = 0; j <num ; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String kind = st.nextToken();
                if (map.containsKey(kind)) {
                    map.put(kind, map.get(kind) + 1);
                }else{
                    map.put(kind, 1);
                }
            }
            int result = 1;
            for (int value : map.values()) {
                result *= (value + 1);
            }
            sb.append(result - 1 + "\n");
        }
        System.out.println(sb);
    }
}



