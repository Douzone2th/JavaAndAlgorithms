package week_14;

import java.io.*;
import java.util.*;

public class bj1337 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int cnt = 0;
        int end = n<5 ? 1 : n;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            int curNum = Integer.parseInt(br.readLine());
            list.add(curNum);
        }
        list.sort(Comparator.naturalOrder());
        for(int i = 0; i <end;i++){
            int standardNum = list.get(i)+4;
            for(int j = 0; j < n-i;j++){
                int compareNum = list.get(i+j);
                if(standardNum >= compareNum){
                    cnt++;
                } else{
                    break;
                }
            }
            if(cnt>max) max = cnt;
            cnt=0;
        }
        System.out.println(5-max);
    }
}