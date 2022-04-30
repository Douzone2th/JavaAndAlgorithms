import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		String doc = s.nextLine();
		String str = s.nextLine();
		
		int cnt = 0 ;
		
		for(int i = 0; i < doc.length() - str.length() +1; i++) {
			
			if(doc.substring(i,i+str.length()).equals(str)) {
				cnt++;
				i += str.length(); //for문을 빠져나갈때 i++되므로 +1 생략
                i--;
			}
            else continue;
		}
		
		
		System.out.println(cnt);
	}
}