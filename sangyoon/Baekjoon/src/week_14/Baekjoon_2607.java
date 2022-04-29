package week_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2607 {
	
	
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine())-1;
        String standard = reader.readLine();
        int len = standard.length();
        int[] alphabet = new int[26]; 
        for(int i=0; i<len; i++) {
            alphabet[standard.charAt(i)-'A']++;
        }
        
        int ans = 0;
        while(n-- > 0) {
            int[] temp = alphabet.clone();
            String comp = reader.readLine();
            int cnt = 0;
            for(int i=0; i<comp.length(); i++) {
                if(temp[comp.charAt(i)-'A'] > 0) {
                    cnt++;
                    temp[comp.charAt(i)-'A']--;
                }
            }
            if(len-1 == comp.length() && cnt == comp.length()) { //���̰� �ѱ��� ���� ��
                ans++;
            } else if(len == comp.length()) { //���̰� ���� ��
                if(cnt == len || cnt == len-1) ans++;
            } else if(len+1 == comp.length()) { //���̰� �ѱ��� Ŭ ��
                if(cnt == len) ans++;
            }
        }
        System.out.println(ans);
    }
}	
	
	
//	public static void main(String[] args) throws IOException {
//	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	      int n = Integer.parseInt(br.readLine());
//	      int count =0;
//	      String str = br.readLine();
//	      int strLen = str.length();
//	      String[] arr = new String[n-1];
//	      char[] StrtoChar = str.toCharArray();
//		  Arrays.sort(StrtoChar);
//		  String SortedStr = new String(StrtoChar);
//	      
//	      for (int i = 0; i < n-1; i++) {
//	         arr[i] = br.readLine();
//	      }
//	      
////	      for (int i = 0; i < n-1; i++) {
////	    	  System.out.println(solution(arr[i]));
////	      }
////	      System.out.println(SortedStr);
//	      
//	      for (int i = 0; i < arr.length; i++) {
//	    	  //���� �����ϰ�� �׳� ����, �Ѵܾ �ٸ��ܾ �ǵ� ������
//	    	  if(arr[i].length() == SortedStr.length()) {
//	    		  if(toarray(arr[i]).equals(SortedStr)) count++;
//	    		 
//	    		  else{
//	    			  int cnt = 0;
//	    			  String temp = solution(arr[i]);
//	    			  
//	    			  for (int j = 0; j <arr[i].length() ; j++) {
//	    				  for(int k = 0; k<SortedStr.length(); k++) {
//	    					  if(temp.charAt(j) == SortedStr.charAt(k)) {
//	    						  cnt++;
//	    					  };
//	    				  }
//					}
//	    			  if(cnt == arr[i].length()-1) {
//	    				  count++;
//	    			  }
//	    		  }
//	    	  }
//	    	  // ���� ������ ��� �� ������ �ܾ �Ѵܾ� �߰��ǵ� ������
//	    	  else if (arr[i].length()-1 == SortedStr.length() ) {
//	    		  if(SortedStr.contains(solution(arr[i]))) count++;
//	    	  }
//	    	  //���� ������ ��� �� ������ �ܾ �Ѵܾ� �����Ǿ ������
//	    	  else if (arr[i].length()+1 == SortedStr.length()) {
//	    		  if(solution(arr[i]).contains(SortedStr)) count++;
//	    	  }
//	      }
//
//	      System.out.println(count);
//		}
//	 
//	public static String solution(String str) {
//		String answer = "";
//		
//		
//		for (int i = 0; i < str.length(); i++) {
//			if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
//		}	
//		
//		return toarray(answer);
//	}
//	
//	public static String toarray(String str) {
//		char[] arrtoChar = str.toCharArray();
//		Arrays.sort(arrtoChar);
//		String Sortedarr= new String(arrtoChar);
//		
//		return Sortedarr;			
//	}
	

