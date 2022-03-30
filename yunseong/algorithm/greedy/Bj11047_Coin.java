package algorithm.greedy;

import java.util.Scanner;

public class Bj11047_Coin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int money = sc.nextInt();
        int[] coin = new int[n]; int answer=0;

        for(int i = 0 ; i < n ; i++) coin[i] = sc.nextInt();//코인초기화

        for (int i = n - 1; i >= 0; i--) {//값이 큰 코인부터 검색, 역순으로 돌린다.
            while(coin[i] <= money && money - coin[i] >= 0) {//코인이 총값(머니)보다 작아진 순간 && 총값(머니)에서 코인을 뺀게 0보다 같거나 커야
                money -= coin[i]; //총값에서 코인을 뺸다.
                answer++;
            }
            if(money==0) break;//머니가 0이면 더 할 필요가 없다.
        }
        System.out.println(answer);
    }

}
