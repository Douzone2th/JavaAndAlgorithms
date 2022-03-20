package weeks_8;

import java.util.HashMap;

//프로그래머스 레벨2 전화번호 목록
public class Programmers_42577 {
    public static void main(String[] args) {
        String[] arr = {"119", "97674223", "1195524421"};

        System.out.println(solution(arr));
    }

    public static boolean solution(String[] phone_book) {
        // 해시 셋
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i + 1);
        }

        for (String str : phone_book) {
            //0 부터 str.length까지 자른것들이 map 들어있는지 확인
            for (int i = 0; i < str.length(); i++) {
                if (map.containsKey(str.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
