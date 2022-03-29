package week_10;

import java.io.*;
import java.util.StringTokenizer;

public class bj11203 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int h = Integer.parseInt(st.nextToken());
        long high = 1;
        long answer;
        if(st.hasMoreTokens()){
            String route = st.nextToken();
            for (int i = 0; i < route.length(); i++) {
                if(route.charAt(i) == 'L'){
                    high = high * 2;
                }else if(route.charAt(i) == 'R'){
                    high = (high * 2)+1;
                }
            }
        }
        answer = (long)((Math.pow(2,h+1))-high);
        System.out.println(answer);
    }
}
