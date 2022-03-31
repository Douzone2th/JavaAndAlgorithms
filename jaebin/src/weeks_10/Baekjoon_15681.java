package weeks_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;//백준 알고리즘 15681번 : 트리와 쿼리
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//백준 알고리즘 15681번 : 트리와 쿼리
public class Baekjoon_15681 {
    // 자신 포함 자식 노드의 개수 , 인덱스 번호는 노드의 번호
    static int[] childNodeNum;
    //각 배열안에 리스트
    // List<Integer> 원소의 타입이 리스트로 되어있다.
    static List<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 9 5 3
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        list = new ArrayList[n+1];
        childNodeNum = new int[n+1];
        // 자기자신까지 포함하니까 모든 개수는 일단 1에서 시작
        Arrays.fill(childNodeNum,1);

        // 1부터 n(9)까지
        for (int i = 1; i < n+1; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            // u-v 연결
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            //각자 자식 추가
            list[u].add(v);
            list[v].add(u);
        }
        //루트 노드를 시작으로 트리 후위 순회
        //루트 노드 번호, 부모 노드가 없으면 -1
        rec(r,-1);
        for (int i = 0; i < q; i++) {
            System.out.println(childNodeNum[Integer.parseInt(br.readLine())]);
        }
    }

    private static void rec(int idx, int parent) {
        //idx 인덱스의 List의 원소들 for each
        //리프노드면 for문을 빠져나감
        for(int nextChild : list[idx]){

            if (nextChild != parent){
                rec(nextChild,idx);
            }
        }
        if (parent !=-1){
            childNodeNum[parent] += childNodeNum[idx];
        }
    }
}
