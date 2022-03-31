package week_10;

import java.io.*;
import java.util.*;

public class bj15681 {
    static ArrayList<Integer>[] list, tree;
    static int parent[], size[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        parent = new int[n + 1];
        size = new int[n + 1];
        list = new ArrayList[n + 1];
        tree = new ArrayList[n + 1];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
            tree[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list[u].add(v);
            list[v].add(u);
        }
        makeTree(r, -1);
        countSubtreeNodes(r);
        StringBuffer sb = new StringBuffer();
        while (q-- > 0) {
            int query = Integer.parseInt(br.readLine());
            sb.append(size[query]).append("\n");
        }
        System.out.println(sb);
    }


    public static void makeTree(int curNode, int p) {
        for (int node : list[curNode]) {
            if (node != p) {
                tree[curNode].add(node);
                parent[node] = curNode;
                makeTree(node, curNode);
            }
        }
    }

    public static void countSubtreeNodes(int curNode) {
        size[curNode] = 1;
        for (int node : tree[curNode]) {
            countSubtreeNodes(node);
            size[curNode] += size[node];
        }
    }
}
