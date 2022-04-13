package algorithm.dynamicProgramming;

import java.util.*;

public class Bj9461_WaveSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for( int i = 0 ; i < num ; i++) {
            arr[i] = sc.nextInt();
        }
        for( int i = 0 ; i < num ; i++) {
            System.out.println(waveSeq(arr[i]));
        }
    }

    static long waveSeq( int n ) {
        long[] arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;
        arr[5] = 2;
        for( int i = 6 ; i <= n ; i++) {
            arr[i] = arr[i-1] + arr[i-5];
        }
        return arr[n];
    }

}