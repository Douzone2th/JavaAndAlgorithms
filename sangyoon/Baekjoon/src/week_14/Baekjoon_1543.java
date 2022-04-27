package week_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1543 {
   public static void main(String[] args) {
      BufferedReader br = null;
      try {
         br = new BufferedReader(new InputStreamReader(System.in));
         String testcase = br.readLine();
         String ans = br.readLine();
         System.out.println(solution(testcase, ans));
      } catch (IOException ie) {
         ie.printStackTrace();
      }
   }
   public static int solution(String testcase, String ans) {
      int count = 0;
      testcase = testcase.replaceAll(String.format("(%s)", ans), "1");
      char[] ch = testcase.toCharArray();
      for(int i = 0; i < testcase.length(); i++) {
         if(ch[i] == '1') count ++;
      }
      return count;
   }
}