
# Stack & Queue
## Stack : 한쪽 끝에서만 자료를 넣고 뺄 수 있는 LIFO(Last In First Out) 형식의 자료구조
          -LinkedList로 구현 가능
## Queue : 한쪽 끝에서는 삽입연산만 이루어지며 다른 한쪽 끝에서는 삭제연산만이 이루어지는 FIFO(First In Fist Out) 형식의 자료구조
          -일차원배열(원형 큐), LinkedList로 구현가능


## 20220131 - 주식가격 (프로그래머스) 
- stack 사용
- 배열 prices가 매개변수로 주식 가격이 떨어지지 않은 시간(초)
- 마지막 시점에 모든 가격이 떨어짐

## 20220201 - 프린트 (프로그래머스) 
- queue 사용
- 인쇄목록은 중요도 높은 순서로 인쇄. 요청한 문서의 인쇄 순서
- 반례 확인 필요

## 20220202 - 문자열 폭발 (백준 알고리즘 9935)  
- stack 사용
- 폭발 문자열이 문자열에서 없어질 때 까지 반복. 남은 문자 없을 경우 "FRULA"
- 문자열 다시 합칠때 StringBuilder를 이용해야함 (String 타입으로는 크기가 부족함)

## 20220203 - 제로 (백준 알고리즘 107335)
- stack 사용
- 잘못 입력하는 수를 지우고 나머지 입력한 수의 합

## 20220204 - 다리를 지나는 트럭 (백준 알고리즘 42583)
- queue 사용
- 다리에 올라갈수 있는 트럭의 수와 다리가 견딜수 있는 무게에 맞춰 트럭이 다리를 건너는 최단시간을 구하기
- 트럭이 다리를 지나기 위해서는 다리에 올라갈 수 있는 트럭의 수만큼 지나가야함
