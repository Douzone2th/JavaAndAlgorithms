package week_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj13116 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        for (int i = 0;i<num; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int min = Math.min(A, B);
            if(min == A) {
                while(true) { // 1.
                    if(B - A < A) break;
                    B/=2;
                }
            } else {
                while(true) {
                    if(A - B < B) break;
                    A/=2;
                }
            }
            while (A != B) { // 2.
                if(A > B) {
                    A /= 2;
                    if(A== B) break;
                    B /= 2;
                }
                else {
                    B /=2;
                    if(A == B) break;
                    A/=2;
                }
            }
            System.out.println(A*10);
        }
    }
}
