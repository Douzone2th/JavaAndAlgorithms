package weeks_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

//백준 알고리즘 13414번 : 수강신청
public class Baekjoon_13414_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        // 학번,순서
        // 대기열에서 클릭을 2번 이상한 학생은 중복
        LinkedHashMap<String, Integer> waitMap = new LinkedHashMap();

        // 수강신청 참가인원
        for (int i = 0; i < L; i++) {
            String s = br.readLine();
            if (waitMap.containsKey(s)) {
                waitMap.remove(s);
            }
            waitMap.put(s, i + 1);
        }
        LinkedList<String> keyList = new LinkedList<>(waitMap.keySet());
        for (String s : keyList) {
            if (K<=0)break;
            System.out.println(s);
            K--;
        }
    }
}
