package map_set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1620 {
    public static void main(String[] args) throws IOException{
        //�엯�젰諛쏄린
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> name = new HashMap<>(); //�씠由꾩쑝濡� 踰덊샇 李얘린
        String num[] = new String[n+1]; //踰덊샇濡� �씠由� 李얘린
        String answer[] = new String[m];

        for(int i=1; i<=n; i++) {
            String tmp = br.readLine();
            name.put(tmp, i);
            num[i] = tmp;
        }

        //�젙�떟 留욎텛湲�
        for(int i=0; i<m; i++) {
            String tmp = br.readLine();

            if(tmp.charAt(0) < 'A') //�닽�옄 �엯�젰諛쏆쓬
                sb.append(num[Integer.parseInt(tmp)]+"\n");
            
            else // 臾몄옄 �엯�젰諛쏆쓬
                sb.append(name.get(tmp)+"\n");
        }
        System.out.println(sb);
    }
}
