package week_13;

import java.io.*;
import java.util.*;

public class bj11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        Integer[] coin = new Integer[num];
        int total = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i = 0; i < num; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coin, Collections.reverseOrder());
        for (int i = 0; i < num; i++) {
            if(total>=coin[i]){
                total = total - coin[i];
                count++;
                System.out.println(coin[i]);
            }
            if(total>=coin[i]) {
                i--;
            }
        }
        System.out.println(count);
    }
}
