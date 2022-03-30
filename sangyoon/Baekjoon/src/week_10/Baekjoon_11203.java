package week_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11203 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st = new StringTokenizer(br.readLine());
      int H = Integer.parseInt(st.nextToken());
      String str = "";
      if (st.hasMoreTokens()) {
         str = st.nextToken();
      }

      // int로 하면 터짐
      long totNode = 1;
      
      //노드의 개수는 2^n -1
      for (int i = 0; i < H + 1; i++) {
         totNode *= 2;
      }
      totNode = totNode - 1;

      
      
      int position = 1;

      //  L이면 제곱, R이면 제곱+1
      if (str != null && str != "") {
         for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L') {
               position = 2 * position;
            } else if (str.charAt(i) == 'R') {
               position = 2 * position + 1;
            }
         }
      }
      //2 의 (height + 1) 제곱에서 해당 자리를 빼면 원하는 정답이 나온다.
      System.out.println(totNode - position + 1);
   }
}