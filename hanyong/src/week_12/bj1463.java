package week_12;

import java.io.*;

public class bj1463 {
    static Integer[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        num = new Integer[N + 1];
        num[0] = num[1] = 0;
        System.out.print(recur(N));
    }
    static int recur(int N) {
        if (num[N] == null) {
            if (N % 6 == 0) {
                num[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
            } else if (N % 3 == 0) {
                num[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
            } else if (N % 2 == 0) {
                num[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
            } else {
                num[N] = recur(N - 1) + 1;
            }
        }
        return num[N];
    }
}