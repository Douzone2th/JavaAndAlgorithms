package week_9;

import java.io.*;
import java.util.StringTokenizer;

public class bj14244 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int i = 0;
        while(true){
            if (cnt >= n-1){
                break;
            }
            if(i == n-m+1){
                i-=1;
            }
            System.out.println(i++ +" "+ (cnt+1));
            cnt++;
        }
    }
}
