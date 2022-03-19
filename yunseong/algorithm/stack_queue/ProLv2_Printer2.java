package algorithm.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class ProLv2_Printer2 {

    public static void main(String[] args) {

    }
    class print {
        int location;
        int priority;
        print(int location, int priority){
            this.location = location;
            this.priority = priority;
        }
        public void setLocation(int location) {
            this.location = location;
        }
        public int getLocation() {
            return this.location;
        }
        public void setPriority(int priority) {
            this.priority = priority;
        }
        public int getPriority() {
            return this.priority;
        }
    }

    public int solution(int[] priorities, int location) {
        //큐에 다 담는다.
        Queue<print> prio = new LinkedList<print>();
        int answer = 1;//몇번 째로 나갈지 저장하는 값 원하는 위치가 아닌게 빠져나갈때마다 늘어난다.
        for(int i = 0 ; i <priorities.length ; i++) {
            print p = new print(i, priorities[i]);//우선순위와 위치를 각각 넣은 프린트 객체
            prio.add(p);//큐에 넣어줌
        }
        while(true) {
            if(prio.peek().getPriority() == max(prio)){//중요도가 가장큰 것과 같으면..
                int loc = prio.poll().getLocation();//그 중요도의 로케이션을 꺼냅니다.
                if(loc == location) {//원하는 로케이션과 내가 찾으려고 하는 로케이션과 매칭시켜봅니다.
                    break;//내가찾으려는 위치와 같으면 브레이크 합니다.
                }else {
                    answer++;//내가찾으려는 위치와 다르면 순서를 하나 올려주고 다음으로 넘어갑니다.
                    continue;
                }
            }else {//중요도보다 낮은 숫자가 나오면
                prio.add(prio.poll());
            }
        }
        return answer;
    }
    public int max (Queue<print> q) {

        Queue<print> tempQ = new LinkedList<>();
        for(int i = 0 ; i < q.size() ; i++) {
            print temp = q.poll();
            tempQ.add(temp);
            q.add(temp);
        }
        int max = 0;
        for(int i = 0 ; i < tempQ.size();) {
            int priority = tempQ.poll().getPriority();
            if(max<priority) {//우선순위를 꺼내서 max값보다 크면
                max = priority;//맥스에 넣어줌
            }
        }
        return max;
    }


}
