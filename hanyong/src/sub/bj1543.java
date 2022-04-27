package sub;

import java.io.*;

public class bj1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String doc = br.readLine();
        String word = br.readLine();
        int count=0;
        while (doc.length() >= word.length()){
            if(doc.startsWith(word)){
                count++;
                doc = doc.substring(word.length());
            }else {
                doc = doc.substring(1);
            }
        }
        System.out.println(count);
    }
}
