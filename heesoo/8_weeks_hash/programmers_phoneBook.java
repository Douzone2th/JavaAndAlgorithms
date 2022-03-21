import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class programmers_phoneBook {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] phone_book = new String[n];
		
		for (int i = 0; i < n; i++) {
			phone_book[i] = br.readLine();
		}
		
		
		System.out.println(solution(phone_book));
	}
	
	public static boolean solution(String[] phone_book) {
		 Arrays.sort(phone_book);        
	        int length = phone_book.length;
	        
	        Map<String, String> map = new HashMap<String, String>();
	        
	        for(String temp : phone_book){
	            map.put(temp, temp);
	        }
	        
	        for(String str : phone_book){
	            for(int index = 0; index < str.length(); index++){
	                String temp = str.substring(0, index);                
	                if( map.containsKey( temp ) ){
	                    return false;
	                }
	            }
	        }
		return true;
    }
}
