package weeks_12;

import java.util.ArrayList;
import java.util.Collections;
//프로그래머스 레벨2 카펫
public class Programmers_42842 {
    public static void main(String[] args) {
        int brown = 50;
        int yellow = 22;
        solution(brown, yellow);
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        int sum = brown + yellow;
        answer = sol(sum,yellow);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }

    public static int[] sol(int n,int y) {
        int result[] = new int[2];
        ArrayList<Integer> arr = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) { // 약수 중 작은 수 저장
                arr.add(i);
                if (n / i != i) { // 약수 중 큰 수 저장
                    arr.add(n / i);
                }
            }
        }
        Collections.sort(arr, Collections.reverseOrder());
        if (arr.size() % 2 == 0) {
            while ((arr.get(0)-2)*(arr.get(arr.size()-1)-2) != y ) {
                arr.remove(0);
                arr.remove(arr.size() - 1);
            }
            result[0] = arr.get(0);
            result[1] = arr.get(arr.size() - 1);
        } else {
            while (arr.size() != 1) {
                arr.remove(0);
                arr.remove(arr.size() - 1);
            }
            result[0] = arr.get(0);
            result[1] = arr.get(0);
        }
        return result;
    }
}
