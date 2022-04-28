package week_13;

import java.io.*;
import java.util.*;

//public class bj11047 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int num = Integer.parseInt(st.nextToken());
//        Integer[] coin = new Integer[num];
//        int total = Integer.parseInt(st.nextToken());
//        int count = 0;
//        for (int i = 0; i < num; i++) {
//            coin[i] = Integer.parseInt(br.readLine());
//        }
//        Arrays.sort(coin, Collections.reverseOrder());
//        for (int i = 0; i < num; i++) {
//            if(total>=coin[i]){
//                total = total - coin[i];
//                count++;
//                System.out.println(coin[i]);
//            }
//            if(total>=coin[i]) {
//                i--;
//            }
//        }
//        System.out.println(count);
//    }
//}


public class bj11047 {
    static int[] ary;
    static int count = 0;

    public static void main(String[] args) {
        BufferedReader br = null;
        StringTokenizer stz;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            stz = new StringTokenizer(br.readLine());
            int testcase = Integer.parseInt(stz.nextToken());
            int value = Integer.parseInt(stz.nextToken());
            ary = new int[testcase];
            for (int i = 0; i < testcase; i++) {
                ary[i] = Integer.parseInt(br.readLine());
            }
            solution(value, ary.length - 1);
            System.out.println(count);
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

        public static void solution(int value, int i) {
        if(value <= 0 || i < 0) return;
        if(ary[i] <= value) {
            count += value / ary[i];
            value = value % ary[i];
        }
        solution(value, --i);

    }

}