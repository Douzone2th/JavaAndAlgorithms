package weeks_10_트리_백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 11203번 : Numbers On a Tree
//분류 : 트리, 수학
public class Baekjoon_11203 {
    public static void main(String[] args) throws IOException {
        //2개의 자식 -> 이진트리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long answer = 0;
        int h = 0;

        if (st.countTokens() == 1) {
            h = Integer.parseInt(st.nextToken());
            answer = (long) Math.pow(2, h + 1) - 1;
            System.out.println(answer);
        } else {
            h = Integer.parseInt(st.nextToken());
            answer = (long) Math.pow(2, h + 1) - 1;
            String str = st.nextToken();

//            long tree[] = new long[answer + 1];
            //삽입
//            tree[0] = 0;
//            for (int i = 1; i < tree.length; i++) {
//                tree[i] = answer;
//                answer--;
//            }
            int count = 1;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == 'L') {
                    count *= 2;
                } else if (c == 'R'){
                    count *= 2;
                    count++;
                }
            }
            answer = answer - count + 1;
            System.out.println(answer);
        }
    }
}
