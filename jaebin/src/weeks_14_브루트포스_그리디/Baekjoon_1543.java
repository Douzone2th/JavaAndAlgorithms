package weeks_14_브루트포스_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 1543번 문서검색
//분류 : 브루트포스, 그리디
public class Baekjoon_1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문서
        StringBuilder sb = new StringBuilder(br.readLine());
        // 검색
        String s = br.readLine();
        // 중복없는 개수
        int cnt = 0;

        while (true) {
            // 문서를 삭제하면서 진행 하기 때문에 문서 길이가 검색길이보다 작으면 break;
            if (s.length() > sb.length()) {
                break;
            } else {
                boolean flag = true;
                for (int i = 0; i < s.length(); i++) {
                    // 문서의 단어 한개와 검색 단어한개가 검사 --> 맞으면 넘어감
                    // 안맞으면 flag false 후 맨 앞단어 삭제후 for문 탈출
                    if (s.charAt(i) != sb.charAt(i)) {

                        sb.deleteCharAt(0);
                        flag =false;
                        break;
                    }
                }
                // 모든 문서검색 통과
                if (!flag){
                    continue;
                }
                // 통과된 문서 길이만큼 삭제
                sb.delete(0, s.length());
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
