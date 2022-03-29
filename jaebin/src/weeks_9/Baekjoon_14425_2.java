package weeks_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//백준 알고리즘 14425번 : 문자열 집합, 트리
public class Baekjoon_14425_2 {
    //자식노드맵과 현재 노드가 마지막 글자인지 여부
    private static class TrieNode {
        // 마지막 글자 여부
        private boolean isLastChar;
        // 자식노드 맵
        private Map<Character, TrieNode> childNodes;

        TrieNode(){
            this.isLastChar = false;
            this.childNodes = new HashMap<>();
        }

        private boolean isLastChar() {
            return isLastChar;
        }

        private void setLastChar(boolean lastChar) {
            isLastChar = lastChar;
        }

        private Map<Character, TrieNode> getChildNodes() {
            return childNodes;
        }

    }

    public static class Trie {
        //루트 노드
        private TrieNode rootNode;

        Trie() {
            rootNode = new TrieNode();
        }

        // Trie에 단어정보 저장
        public void insert(String word) {

            TrieNode thisNode = this.rootNode;
            for (int i = 0; i < word.length(); i++) {
                //computeIfAbsent : key값에 해당하는 Value가 존재하면 가져와서 사용하고
                //없으면 새로 만들어주는 패턴
                char c =word.charAt(i);
                thisNode.childNodes.putIfAbsent(c,new TrieNode());
                thisNode = thisNode.getChildNodes().get(c);
            }
            thisNode.setLastChar(true);
        }

        //특정 단어가 Trie에 존재하는지를 확인하기 위해
        public boolean contains(String word) {
            TrieNode thisNode = this.rootNode;
            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                TrieNode node = thisNode.getChildNodes().get(character);
                if (node == null) {
                    return false;
                }
                thisNode = node;
            }
            return thisNode.isLastChar();
        }

        //  Trie에 넣었던 단어를 삭제
        private void delete(TrieNode thisNode, String word, int index) {
            char character = word.charAt(index); // APPLE, PEN과 같이 아예 없는 단어인 경우 에러 출력
            if (!thisNode.getChildNodes().containsKey(character))
                throw new Error("There is no [" + word + "] in this Trie.");
            TrieNode childNode = thisNode.getChildNodes().get(character);
            index++;
            if (index == word.length()) { // 삭제조건 2번 항목 // PO와 같이 노드는 존재하지만 insert한 단어가 아닌 경우 에러 출력
                if (!childNode.isLastChar()) throw new Error("There is no [" + word + "] in this Trie.");
                childNode.setLastChar(false); // 삭제조건 1번 항목 // 삭제 대상 언어의 제일 끝으로써 자식 노드가 없으면(이 단어를 포함하는 더 긴 단어가 없으면) 삭제 시작
                if (childNode.getChildNodes().isEmpty()) thisNode.getChildNodes().remove(character);
            } else {
                delete(childNode, word, index); // 콜백함수부분 // 삭제조건 1,3번 항목 // 삭제 중, 자식 노드가 없고 현재 노드로 끝나는 다른 단어가 없는 경우 이 노드 삭제
                if (!childNode.isLastChar() && childNode.getChildNodes().isEmpty())
                    thisNode.getChildNodes().remove(character);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Trie trie = new Trie();
        for (int i = 0; i < N; i++) trie.insert(br.readLine());
        for (int i = 0; i < M; i++) {
            if (trie.contains(br.readLine())) answer++;
        }
        System.out.println(answer);
    }
}
