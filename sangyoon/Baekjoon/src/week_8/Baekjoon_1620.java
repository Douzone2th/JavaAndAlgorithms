package week_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" "); // 줄의 수 : n, 문제의 개수 : m
        int n = Integer.parseInt(inputs[0]); 
        int m = Integer.parseInt(inputs[1]);

        HashMap<Integer, String> map_int = new HashMap<>(); // value 값으로 입력했을 경우 -> 번호
        HashMap<String, Integer> map_str = new HashMap<>(); // key 값으로 입력했을 경우 -> 포켓몬 이름
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            map_int.put(i, name); // key에 번호를 value에 포켓몬 이름을
            map_str.put(name, i); // value에 포켓몬 이름을, key에 번호를
        }
        
        String[] result = new String[m]; // 입력받을 문제의 수 만큼 공간 할당
        
        for (int i = 0; i < m; i++) { // 문제 입력
			result[i] = br.readLine();
			System.out.println(result[i]);
		}
        
        // 정규식으로 String 중에 int인지 아닌지 판별
        for (int i = 0; i < m; i++) {
        	boolean isNum = false;
            isNum = result[i].matches("[0-9]+[\\.]?[0-9]*"); // 문제 중 순서대로 숫자인지 체크하고 숫자면 True 리턴
            if(isNum) {
            	System.out.println(map_int.get(Integer.parseInt(result[i]))); // int면 map_int hashmap에서 포켓몬 이름 리턴
            }
            else {
            	System.out.println(map_str.get(result[i])); // int 가 아니면 map_str hashmap에서 번호 리턴
            }
              
		}
    }
}
