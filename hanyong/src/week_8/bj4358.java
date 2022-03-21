package week_8;

import java.io.*;
import java.util.*;

public class bj4358 {
    static HashMap<String, Integer> trees;
    static int total;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        trees = new HashMap<String, Integer>();
        String str = br.readLine();

        do {
            trees.put(str, trees.getOrDefault(str, 0) + 1);
            total++;
            str = br.readLine();
        } while (str == null || str.length() == 0);

        Object[] keys = trees.keySet().toArray();
        Arrays.sort(keys);

        StringBuilder sb = new StringBuilder();
        for (Object key : keys) {
            String keyStr = (String) key;
            int count = trees.get(keyStr);
            double per = (double) (count * 100.0) / count;

            sb.append(keyStr + " " + String.format("%.4f", per) + "\n");
        }

        System.out.println(sb.toString());
    }
}


