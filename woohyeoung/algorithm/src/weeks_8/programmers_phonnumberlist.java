package weeks_8_해시맵;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class programmers_phonnumberlist {
	public static void main(String[] args) {
		System.out.println("값 입력 시작----------값 입력이 끝나면 exit입력");
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> strArr = new ArrayList<>();
		while(scanner.hasNext()) {
			String str = scanner.next();
			strArr.add(str);
			if(str.equalsIgnoreCase("exit")) break;
		}
		String[] strAry = strArr.toArray(new String[strArr.size()]);
		boolean flag = solution(strAry);
		System.out.println(flag);
		scanner.close();
	}
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length - 1; i++)
            if(phone_book[i+1].length() > phone_book[i].length()){
                if(phone_book[i + 1].substring(0, phone_book[i].length())
                   .contains(phone_book[i])){
                    answer = false;
                }
            }
        return answer;
    }
}