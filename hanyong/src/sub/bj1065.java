package sub;

import java.util.Scanner;

public class bj1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(cal(num));
    }
    public static int cal(int num){
        int[] arr = new int[3];
        int ans = 0;
        if (num < 100) {
            return num;
        }else{
            if(num==1000){
                num = 999;
            }
            for (int i = 100; i <= num; i++) {
                arr[0] = (i%1000)/100;
                arr[1] = (i%100)/10;
                arr[2] = i%10;
                if (arr[0]-arr[1] == arr[1]-arr[2]){
                    ans++;
                }
            }
            return ans+99;
        }
    }
}
