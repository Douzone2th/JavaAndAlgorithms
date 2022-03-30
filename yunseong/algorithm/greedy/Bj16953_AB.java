package algorithm.greedy;

import java.util.Scanner;

public class Bj16953_AB {
    public static void main(String[] args) {
        //162 끝자리가 1인지 확인
        //아니면
        //나누기 2
        //1이면
        //1 붙이고 끝냄
        Scanner sc = new Scanner(System.in);
        int su = sc.nextInt();//들어온값
        int q = sc.nextInt();//구해야할 값
        int answer = 0;
        while(true) {
            if(q==su) {
                System.out.println(answer+1);
                break;
            }
            if(q==0) {
                System.out.println(-1);
                break;
            }
            if (q % 10 == 1) {//끝자리가 1이면
                q/=10; //2 222 111
                answer++;
            } else {
                if (q % 2 != 0) {
                    System.out.println(-1);
                    break;
                } else {
                    q /= 2;
                    answer++;
                }
            }
        }
    }
}
