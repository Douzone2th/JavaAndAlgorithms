package week_12;

import java.io.*;

public class bj9095 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int list[] = new int[11];
        list[1] = 1;
        list[2] = 2;
        list[3] = 4;
        for(int i = 4; i < 11; i++)
            list[i] = list[i-1] + list[i-2] + list[i-3];
        for(int i = 0; i < num; i++){
            sb.append(list[Integer.parseInt(br.readLine())]+"\n");
        }
        System.out.println(sb);
    }
}


