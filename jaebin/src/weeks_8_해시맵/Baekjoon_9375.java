package weeks_8_해시맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//백준 알고리즘 : 9375번, 패션왕 신혜빈
//분류 : 해시맵
public class Baekjoon_9375 {
    /**
     * 조합과 해시맵
     * 각 옷의 종류에서 1개 밖에 선택 할 수 없다.
     * (옷의 종류1 + 1(옷을 안입는경우)) * (옷의 종류2 + 1(옷을 안입는경우)) * ... *(옷의 종류 n + 1(옷을 안입는경우))
     * 에서 옷을 하나도 안입는경우를 빼주어야한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int count = 0;
            // 총 개수
            int k = Integer.parseInt(br.readLine());
            //key 의상 종류 , 의상 종류 개수
            HashMap<String, Integer> map = new HashMap();
            for (int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                //옷의 이름은 필요가 없다.
                st.nextToken();
                String cType = st.nextToken();
                if (map.containsKey(cType)) map.put(cType, map.get(cType) + 1);
                else map.put(cType, 1);
            }
            int mul = 1;
            for (int item : map.values()) {
                mul *= (item + 1);
            }
            mul--;
            System.out.println(mul);
        }
    }
//    // Value 값으로 Key값 찾기 예시시
//    public static <K V> K getKey(HashMap<K, V> map, V value) {
//        // 먼저 keySet()으로 map에 저장되어 있는 key들을 Set인터페이스로 변환
//        // 그 Key 값 하나하나씩 인자 key와 비교 해서 맞으면 해당 키를 반환 없으면 null
//         for (K key : map.keySet()) {
//            if (value.equals(map.get(key))) {
//                return key;
//            }
//        }
//        return null;
//    }
}
