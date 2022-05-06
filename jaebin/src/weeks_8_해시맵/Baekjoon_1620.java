package weeks_8_해시맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//백준 알고리즘 1620번 : 나는야 포켓몬 마스터 이다솜
public class Baekjoon_1620 {
    /**
     * map에 한번씩 포켓몬 번호와 포켓몬 이름을 넣고 value 값을 찾을경우 시간초과가 났다.
     * 메모리를 더쓰고 , 시간을 줄이기 위해 map 한번은 포켓몬 번호와 포켓몬이름, 한번은 포켓몬 이름과 포켓몬 번호로 넣어주었다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            map.put(String.valueOf(i + 1), s);
            map.put(s, String.valueOf(i + 1));
        }
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            //key값으로 value 값 찾기
            String found = map.get(s);
            System.out.println(found);
        }

    }

//    // 숫자인지 문자인지 체크 -> 필요없어짐.
//    private static boolean checkStrNum(String str) {
//        try {
//            Integer.parseInt(str);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }
//    }

//    //value 값으로 key값 찾기 (stream 이용) -> 시간초과
//    public static Object getKeyStream(HashMap<Integer, String> map, String s) {
//        Set<Integer> foundKeys = map.entrySet().stream()
//                .filter(entry -> Objects.equals(entry.getValue(), s))
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toSet());
//        return foundKeys.toArray()[0];
//    }

//    // Value 값으로 Key값 찾기 (for - each)  -> 시간초과
//    public static <K, V> K getKeyForEach(HashMap<K, V> map, V value) {
//        // 먼저 keySet()으로 map에 저장되어 있는 key들을 Set인터페이스로 변환
//        // 그 Key 값 하나하나씩 인자 key와 비교 해서 맞으면 해당 키를 반환 없으면 null
//        for (K key : map.keySet()) {
//            if (value.equals(map.get(key))) {
//                return key;
//            }
//        }
//        return null;
//    }
}
