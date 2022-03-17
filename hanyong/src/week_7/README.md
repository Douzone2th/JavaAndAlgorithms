# 7주차_브루트포스(Brute force) (3/7 ~ 3/11)
------------------------
## 1. 개념
------------------------
### 1. 브루트 포스란?
> 1.1 정의
>> 모든 경우의 수를 탐색하여 요구조건을 총족하는 결과만을 출력 </br>
>> 선형 구조를 전체적으로 탐색하는 방법은 순차 탐색이 대표적 </br>
>> 비선형 구조를 전체적으로 탐색하는 방법은 깊이 우선 탐색(DFS)과 너비 우선 탐색(BFS)이 대표적 </br>
>> 어떠한 방식으로든 전체 탐색으로 문제를 해결한 경우 브루트 포스 알고리즘을 이용한 것 </br>
>> 조금 더 발전된 알고리즘을 생각하는 출발점. </br>
>
> 1.2 장점
>> 가장 단순하고 가장 확실한 문제 해결방법. </br>
>> 완벽한 병렬작업이 가능. </br>
>
> 1.3 단점
>> 문제의 복잡도가 복잡해지면 필요한 자원이 기하급수적으로 증가한다. </br>
>> 자원의 사용이 매우 비효율적이다. </br>

### 2. 브루트 포스의 종류
> 2.1 순차 탐색
>> 데이터의 첫 부분부터 순차적으로 데이터를 비교하여 원하는 데이터의 위치를 찾는 알고리즘 </br>
>> 탐색 방법중에서 가장 간단하고 직접적인 탐색 방법 </br>
>
> 2.2 깊이 우선 탐색(DFS)
>> 루트 노드에서 시작해서 다음 분기(branch)로 넘어가기 전에 해당 분기를 완벽하게 탐색하는 방법 </br>
>> 넓게(wide) 탐색하기 전에 깊게(deep) 탐색 </br>
>> 너비 우선 탐색(BFS)보다 좀 더 단순하지만 오래 걸리는 탐색방법 </br>
>> 재귀함수를 이용하여 구현 </br>
>
> 2.3 너비 우선 탐색(BFS)
>> 루트 노드에서 시작해서 인접한 노드를 먼저 탐색하는 방법 </br>
>> 순환알고리즘 형태로 이미 방문한 노드를 정확히 검사하지 않으면 무한루프에 빠질 위험이 있음. </br>
>> 깊게(deep) 탐색하기 전에 넓게(wide) 탐색 </br>
>> 두 노드 사이의 최단 경로 혹은 임의의 경로를 찾고 싶을 때 </br>
>> 깊이 우선 탐색(DFS)보다 좀 더 복잡하지만 빠른 탐색방법 </br>
> 
> 2.4 백트래킹
>> 재귀적으로 문제를 하나씩 풀어나가되 현재 재귀를 통해 확인 중인 상태가 제한 조건에 위배되는지 판단하고 그러한 경우 해당 상태를 제외하고 다음 단계로 나아가는 방식 </br>
>> 더 이상 탐색할 필요가 없는 상태를 제외하는 것을 가지치기(pruning)라고 함. </br>
>> 의사 결정, 최적화, 열거하기 등의 문제를 해결하기 위해 사용가능. </br>
>> 백트래킹 사용한 경우는 대부분 Dynamic Programming, 그리디 알고리즘 등으로 더 빠르게 해결가능하지만 일부 경우 백트래킹만으로 해결가능한 문제가 있어서 해당경우 사용.</br>
> 
## 2. 문제</br>

3/7, 백준 알고리즘 : [30885번 사탕 게임](https://www.acmicpc.net/problem/30885) </br>
3/8, 백준 알고리즘 : [1182번 부분수열의 합](https://www.acmicpc.net/problem/1182) </br>
3/9, 백준 알고리즘 : [2503번 숫자야구](https://www.acmicpc.net/problem/1120) </br>
3/10, 백준 알고리즘 : [2178 미로탐색](https://www.acmicpc.net/problem/1476) </br>
3/11, 백준 알고리즘 : [1759번 암호 만들기](https://www.acmicpc.net/problem/9663) </br>
