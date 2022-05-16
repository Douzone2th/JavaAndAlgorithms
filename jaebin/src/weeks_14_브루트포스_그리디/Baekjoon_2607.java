package weeks_14_브루트포스_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 2607번 비슷한 단어
//분류 : 구현, 문자열
public class Baekjoon_2607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String standard = br.readLine();
        int[] a = new int[26];
        for (int i = 0; i < standard.length(); i++) {
            a[standard.charAt(i) - 'A']++;
        }

        int cnt = 0;

        for (int i = 1; i < n; i++) {
            String search = br.readLine();
            int[] b = a.clone();
            int same = 0;

            for (int j = 0; j < search.length(); j++) {
                if (b[search.charAt(j) - 'A'] > 0){
                    same ++;
                    b[search.charAt(j) - 'A']--;
                }
            }

            if (search.length() == standard.length()-1 && same == search.length()){
                cnt ++;
            }else if(search.length() == standard.length()+1 && same == standard.length()){
                cnt ++;
            }else if(search.length() == standard.length()){
                //같은 경우
                if(same == search.length() || same == search.length()-1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
