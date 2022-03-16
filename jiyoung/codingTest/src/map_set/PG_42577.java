package map_set;

import java.util.*;
import java.io.*;

public class PG_42577 {
	
	public static boolean solution(String[] phone_book) {
		//접두사가 같은게 비슷한 위치에 있도록 정렬된 treeset 사용
		TreeSet<String> set = new TreeSet();
		
		for(int i=0; i<phone_book.length; i++) set.add(phone_book[i]);
		
		Iterator<String> it = set.iterator();
		
		
		return true;
	}

	public static void main(String[] args) {
		//Test Set
		String[] t1 = {"119", "97674223", "1195524421"}; //false
		String[] t2 = {"123","456","789"}; //true
		String[] t3 = {"12","123","1235","567","88"}; //false
		String[] t4 = {"12", "234","456", "567", "5678"}; // false
		
		if(solution(t3)) System.out.println("test : true");
		else System.out.println("test : false");
	}

}
