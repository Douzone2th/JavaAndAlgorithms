package algorithm.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bj12788_IUPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int sum = m*k;
        int idx = 0;
        Integer[] pen = new Integer[n];
        for(int i = 0 ; i < n ; i++) {
            pen[i] = sc.nextInt();
        }

        Arrays.sort(pen, Collections.reverseOrder());

        while(sum > 0) {
            if(idx < n) {
                sum -= pen[idx];
                idx++;
            } else break;
        }
        if(sum > 0) {
            System.out.println("STRESS");
        }else {
            System.out.println(idx);
        }
    }
}
