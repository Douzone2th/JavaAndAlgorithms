package sub;

import java.util.Scanner;

public class bj14888 {
    static int max;
    static int min;
    static int[] opt = new int[4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < opt.length; i++) {
            opt[i] = sc.nextInt();
        }
    }
}
