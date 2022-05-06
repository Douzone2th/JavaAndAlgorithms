package weeks_12_완전탐색;

import java.util.ArrayList;

//프로그래머스 레벨2 : 완전 탐색 소수찾기
public class Programmers_42839 {
    public static void main(String[] args) {
        String s = "17";
        solution(s);
    }

    public static boolean visited[];
    public static ArrayList<Integer> all;

    public static int solution(String numbers) {
        int answer = 0;
        int n = numbers.length();
        String[] card = new String[n];
        visited = new boolean[n + 1];
        all = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            card[i] = Character.toString(numbers.charAt(i));
        }

        for (int r = 0; r < n; r++) {
            rec(card, "", r + 1, 0);
        }

        answer = all.size();
        System.out.println(answer);
        return answer;
    }

    public static void rec(String[] card, String str, int r, int depth) {
        if (depth == r) {
            int tmp = Integer.parseInt(str);
            if (prime(tmp) && !all.contains(tmp)) {
                all.add(tmp);
            }
            return;
        }
        for (int i = 0; i < card.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                str = str + card[i];
                rec(card, str, r, depth + 1);
                str = str.substring(0, str.length() - 1);
                visited[i] = false;
            }
        }
    }

    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; //num이 i의 배수면 소수가 아니므로 false
            }
        }
        return true;
    }
}
