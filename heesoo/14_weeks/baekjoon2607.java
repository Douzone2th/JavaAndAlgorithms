
import java.util.*;

public class Main {
    public static void main (String[]args) {        //같으면 안댐. 비슷한거(한글자 더하거나 빼거나, 교체하거나) 즉, 기준단어 글자수 +-1까지만 허용
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();
        int[] alpha = new int[26];

        for(int i=0; i<input.length(); i++){
            alpha[input.charAt(i) - 'A']++;
        }

        int cnt = 0;

        for(int test=1; test<n; test++){
            String out = scanner.next();
            int[] beta = alpha.clone();
            int same = 0;

            for(int i=0; i<out.length(); i++){
                if(beta[out.charAt(i) - 'A'] > 0){
                    same++;
                    beta[out.charAt(i) - 'A']--;
                }
            }

            if(out.length() == input.length()-1 && same == out.length())
                cnt++;
            else if(out.length() == input.length()){
                if(same == input.length()-1 || same == input.length())
                    cnt++;
            }
            else if(out.length() == input.length()+1){
                if(same == input.length())
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}
