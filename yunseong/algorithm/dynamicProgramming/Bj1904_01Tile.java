package algorithm.dynamicProgramming;

import java.util.Scanner;

public class Bj1904_01Tile {
    public static void main(String[] args) {
        //1, 00 만 사용해서 2진 수열을 만들어야 함
        // 1 = 1
        // 2 = 2 1, 00
        // 3 = 3  100, 001, 111
        // 4 = 5 1111, 1100, 0011, 0000, 1001
        // 5 = 8
        // 6 = 13
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n];
        if(n == 1) {
            System.out.println(1);
        }else if(n==2){
            System.out.println(2);
        }else{
            dp[0] = 1;
            dp[1] = 2;
            for(int i = 2 ; i < n ; i++) {
                dp[i] = (dp[i-1]+dp[i-2])%15746;
            }
            System.out.println(dp[n-1]);
        }
    }
}
