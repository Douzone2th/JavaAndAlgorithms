package week_8;

import java.io.*;
import java.util.*;

public class bj13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        LinkedHashSet<String> set = new LinkedHashSet<>();

        st = new StringTokenizer(br.readLine());
        int success = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        for (int i = 0; i < total; i++) {
            String num = br.readLine();
            if(set.contains(num)) {
                set.remove(num);
            }set.add(num);
        }
        Iterator iter = set.iterator();
        int i=0;
        while(iter.hasNext()) {
            i++;
            if(i>success){
                break;
            }
            System.out.println(iter.next());
        }
    }
}
