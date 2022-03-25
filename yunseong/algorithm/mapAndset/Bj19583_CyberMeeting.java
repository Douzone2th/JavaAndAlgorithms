package algorithm.mapAndset;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Bj19583_CyberMeeting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int[] time = new int[firstLine.length];
        Map<String, Integer> list = new HashMap<>();

        for (int i = 0; i < firstLine.length; i++) {
            firstLine[i] = firstLine[i].split(":")[0] + firstLine[i].split(":")[1];
            time[i] = Integer.parseInt(firstLine[i]);
        }
        String s;
        int answer = 0;
        while (true) {
            s = br.readLine();
            if (s == null || s.length() == 0) break;
            String[] str = s.split(" ");
            str[0] = str[0].split(":")[0] + str[0].split(":")[1];

            int chatTime = Integer.parseInt(str[0]);
            if (time[2] < chatTime) { //채팅 입력 시간이 스트리밍 시작이후
                break;
            } else if (time[1] <= chatTime && time[2] >= chatTime) { //채팅입력시간이 개강총회 끝과 스트리밍 끝난 시간 사이면
                if (list.containsKey(str[1])) {
                    list.remove(str[1]);
                    answer++;
                }
            } else if (chatTime <= time[0]) {//개강총회 시작전 채팅 이면 맵에 추가
                list.put(str[1], chatTime);
            }
        }
        System.out.println(answer);
    }
}
