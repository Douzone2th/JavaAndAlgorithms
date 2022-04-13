package week_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class bj1302 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<num;i++) {
            String str = br.readLine();
            if(map.containsKey(str))
                map.put(str, map.get(str)+1);
            else
                map.put(str, 1);
        }
        int max = 0;
        String str = null;
        for(String key: map.keySet()) {
            if(max<map.get(key)) {
                max = map.get(key);
                str = key;
            }
            else if(max == map.get(key)) {//맥스값과 같은 권수의 책이 나오면
                if(key.compareTo(str)<0) {//비교하여 앞에 책을 출력
                    str = key;
                }
            }
        }
        System.out.println(str);
    }
}


