package weeks_9_트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon15900 {
	static int node, sum;
    static List<Integer> list[];
    static int visitied[];
    
    static void dfs(int idx) {
    	boolean isLeaf = true;
    	for(int i = 0; i < list[idx].size(); i++) {
    		int next = list[idx].get(i);
    		if(visitied[next]==-1) {
    			isLeaf = false;
    			visitied[next] = visitied[idx]+1;
    			dfs(next);
    		}
    	}
    	if(isLeaf) sum+= visitied[idx];
    }
	public static void main (String[] args) throws java.lang.Exception {
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer stz = new StringTokenizer(br.readLine());
		    node = Integer.parseInt(stz.nextToken());
		    sum = 0;
		    visitied = new int[node + 1];
		    list = new ArrayList[node + 1];
		    for(int i = 1; i <= node; i++) {list[i] = new ArrayList<Integer>(); visitied[i] = -1;}
		    for(int i = 0; i < node-1; i++) {
		    	stz = new StringTokenizer(br.readLine());
		    	int n = Integer.parseInt(stz.nextToken());
		    	int m = Integer.parseInt(stz.nextToken());
		    	list[n].add(m);
		    	list[m].add(n);
		    }
		    visitied[1] = 0;
		    dfs(1);
		    System.out.println(sum%2==0 ? "No":"Yes");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}