package week_8;

import java.util.HashMap;

// 프로그래머스 레벨 2 : 전화번호 목록 해시
public class Programmers_42577 {
	public static void main(String[] args) {
		String[] str= {"119", "97674223", "1195524421"};
		System.out.println(Solution(str));
	}
	
    public static boolean Solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        // 모든 전화번호 Hashing 하기 (Hash Map에 추가하기)
        for (int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i], i);
		}
        
        //각 전화번호의 접두어가 HashMap에 존재하는지 확인
        for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book[i].length(); j++) {
				if(map.containsKey(phone_book[i].substring(0,j))) 
					return false;
			}
		}
        return answer;
    }
}
	
/*
 * import java.util.Arrays;
 *  Sort/Loop를 사용하여 풀기
 * 	sort 후 Loop를 돌며 앞 번호가 뒷 번호의 접두어인지 확인
 * 
 * 	private static boolean Solution(String[] phone_book) {
		boolean answer = true;
		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length - 1; i++)
			if (phone_book[i + 1].startsWith(phone_book[i])) return false;
		return answer;
		// TODO Auto-generated method stub
		}
*/		


