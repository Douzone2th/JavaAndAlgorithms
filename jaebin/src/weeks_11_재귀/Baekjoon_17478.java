package weeks_11_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 17478번 : 재귀함수가 뭔가요?
public class Baekjoon_17478 {
    public static StringBuilder sb;
    public static String str = "\"재귀함수가 뭔가요?\"\n";
    public static String back = "라고 답변하였지.\n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        sb = new StringBuilder();
        rec(n, 0);
        System.out.println(sb);
    }

    //2, 0
    public static void rec(int goal, int i) {
        String main = "____";
        StringBuilder front = new StringBuilder();
        for (int j = 0; j < i; j++) {
            front.append(main);
        }
        sb.append(front + str);
        if (goal == i) {
            sb.append(front + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
            sb.append(front + back);
            return;
        }
        sb.append(front + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n" +
                front + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n" +
                front + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
        rec(goal, i + 1);
        sb.append(front + back);
        return;
    }
}
