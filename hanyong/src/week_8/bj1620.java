package week_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class bj1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<Integer, String> mapN = new HashMap<>();
        HashMap<String, Integer> mapS = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        for (int i = 1; i < num + 1; i++) {
            String pmn = br.readLine();
            mapN.put(i, pmn);
            mapS.put(pmn, i);
        }
        for (int i = 0; i < Q; i++) {
            String quiz = br.readLine();
            if(isNumber(quiz)){
                System.out.println(mapN.get(Integer.parseInt(quiz)));
            }else{
                System.out.println(mapS.get(quiz));
                //2중 for문 사용시 시간초과
                /*for (int j = 1; j < num+1; j++) {
                    String temp = mapN.get(j);
                    if(quiz.equals(temp)) {
                        System.out.println(j);
                    }
                }*/
            }
        }
    }
    public static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
