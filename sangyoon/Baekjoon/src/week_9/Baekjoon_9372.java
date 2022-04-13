package week_9;

import java.util.*;
public class Baekjoon_9372 {		
	public static void main(String[] args) {
//		Spanning Tree란
//		그래프 내의 모든 정점을 포함하는 트리
//		Spanning Tree = 신장 트리 = 스패닝 트리
//		Spanning Tree는 그래프의 최소 연결 부분 그래프 이다.
//		최소 연결 = 간선의 수가 가장 적다.
//		n개의 정점을 가지는 그래프의 최소 간선의 수는 (n-1)개이고, (n-1)개의 간선으로 연결되어 있으면 필연적으로 트리 형태가 되고 이것이 바로 Spanning Tree가 된다.
//		즉, 그래프에서 일부 간선을 선택해서 만든 트리
		
//		Spanning Tree의 특징
//		DFS, BFS을 이용하여 그래프에서 신장 트리를 찾을 수 있다.
//		탐색 도중에 사용된 간선만 모으면 만들 수 있다.
//		하나의 그래프에는 많은 신장 트리가 존재할 수 있다.
//		Spanning Tree는 트리의 특수한 형태이므로 모든 정점들이 연결 되어 있어야 하고 사이클을 포함해서는 안된다.
//		따라서 Spanning Tree는 그래프에 있는 n개의 정점을 정확히 (n-1)개의 간선으로 연결 한다.

//		MST란
//		Spanning Tree 중에서 사용된 간선들의 가중치 합이 최소인 트리
//		MST = Minimum Spanning Tree = 최소 신장 트리
//		각 간선의 가중치가 동일하지 않을 때 단순히 가장 적은 간선을 사용한다고 해서 최소 비용이 얻어지는 것은 아니다.
//		MST는 간선에 가중치를 고려하여 최소 비용의 Spanning Tree를 선택하는 것을 말한다.
//		즉, 네트워크(가중치를 간선에 할당한 그래프)에 있는 모든 정점들을 가장 적은 수의 간선과 비용으로 연결하는 것이다.

//		MST의 특징
//		간선의 가중치의 합이 최소여야 한다.
//		n개의 정점을 가지는 그래프에 대해 반드시 (n-1)개의 간선만을 사용해야 한다.
//		사이클이 포함되어서는 안된다.
		
//		"주어진 비행 스케줄은 항상 연결 그래프 형태이다. " 라는 문장에서 국가 -> 정점 , 비행편  -> 간선 이 되는 셈 이다.
	


//		모든 정점(국가) 를 최소한의 간선(비행기의 종류) 로 방문하는 것은 결국 MST(최소신장트리) 문제이다. 
//		이번 문제에서 단순히 모든 국가를 방문하기 위해, 이용해야하는 최소 비행기 종류이므로 최종 답은 MST의 간선 갯수인 n-1 임을 알 수 있다.

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ansArr[] = new int[num];
		for( int n = 0 ; n < num ; n++ ) {
			int countryNum = sc.nextInt();
			int planeNum = sc.nextInt();
			for( int i = 0 ; i < planeNum ; i++ ) {
				int a = sc.nextInt();
				int b = sc.nextInt();
			}
			ansArr[n] = countryNum-1; // 즉 간선(비행기 종류) -1 개가 result 임을 알수있다.
		}
		for( int i : ansArr)
			System.out.println(i); // 2개의 테스트케이스일 때 2개의 result 반환
	}
}