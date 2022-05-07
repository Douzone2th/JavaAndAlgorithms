package weeks_8_해시맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//백준 알고리즘 13414번 : 수강신청
public class Baekjoon_13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        // 학번,순서
        // 대기열에서 클릭을 2번 이상한 학생은 중복

        HashMap<String, Integer> waitMap = new HashMap();

        // 수강신청 참가인원
        for (int i = 0; i < L; i++) {
            String s = br.readLine();
            if (waitMap.containsKey(s)) {
                waitMap.remove(s);
            }
            waitMap.put(s, i + 1);
        }
        //value 값으로 오름차순 정렬
        // entrySet()을 이용하여 맵의 지정된 키와 값을 entry의 형태로 Set에 저장해서 반환하여 entryList에 저장한다.
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(waitMap.entrySet());
        // 리스트를 엔트리의 value값을 오름차순으로 정렬
        entryList.sort(Map.Entry.comparingByValue());

        for (Map.Entry<String, Integer> a : entryList) {
            if (K <= 0) break;
            System.out.println(a.getKey());
            K--;
        }
    }
}
