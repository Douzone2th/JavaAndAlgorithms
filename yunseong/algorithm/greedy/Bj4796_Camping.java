package algorithm.greedy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import java.util.Scanner;
public class Bj4796_Camping {
    public static void main(String[] args)  {
        // 연속 8일중 5일 사용 연속 8일 중 5일 사용  8일중 4일 사용 14일
        // 연속 8일중 5일 사용 연속 8일 중 5일 사용 8일중 1일 사용 11일
        //연속하는 20일 중 10일만 사용 가능
        //5 8 23  24
        int i = 1;
        Scanner s = new Scanner(System.in);
        while(true) {

            int L = s.nextInt();
            int P = s.nextInt();
            int V = s.nextInt();

            if(L == 0 && P == 0 && V == 0) break;

            int answer = 0;
            if(V%P <= L){
                answer = L * (V/P) + V%P;
            }else {
                answer = (V / P) * L + L;
            }
            System.out.println("Case "+i+": " + answer);
            i++;
        }

    }
}
