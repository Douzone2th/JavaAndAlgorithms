package weeks_9_트리;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 14425번 : 문자열 집합
//분류 : 트리, 트라이
class TrieNode {
    public boolean finish;
    public TrieNode[] next;

    TrieNode() {
        this.finish = false;
        this.next = new TrieNode[26];
    }
}

class Trie {
    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    public void add(String s) {
        TrieNode temp = root;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (temp.next[index] == null) temp.next[index] = new TrieNode();
            temp = temp.next[index];
        }
        temp.finish = true;
    }

    public boolean isContain(String s) {
        TrieNode temp = root;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (temp.next[index] == null) return false;
            temp = temp.next[index];
        }
        if (temp.finish) return true;
        return false;
    }
}

public class Baekjoon_14425 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Trie trie = new Trie();
        for (int i = 0; i < N; i++) trie.add(br.readLine());
        for (int i = 0; i < M; i++) {
            if (trie.isContain(br.readLine())) answer++;
        }
        System.out.println(answer);
    }
}
