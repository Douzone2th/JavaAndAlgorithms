import java.io.*;
import java.util.*;

public class easy_solved {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        double[] sub = new double[num];
        double total=0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < num; i++) {
            sub[i] = Integer.parseInt(st.nextToken());
            total += sub[i];
        }
        System.out.println(total/(double) num);

    }
}
