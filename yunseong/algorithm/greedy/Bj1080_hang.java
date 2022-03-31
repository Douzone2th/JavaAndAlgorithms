package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1080_hang {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NM = br.readLine();
        int N = Integer.parseInt(NM.split(" ")[0]);
        int M = Integer.parseInt(NM.split(" ")[1]);
        int[][] question = new int[N][M];
        int[][] answer = new int[N][M];
        boolean[][] solution = new boolean[N][M];

        //시작 배열
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                question[i][j] = Integer.parseInt(String.valueOf(temp.charAt(j)));
            }
        }
        //최종 배열
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                answer[i][j] = Integer.parseInt(String.valueOf(temp.charAt(j)));
            }
        }
        //현재 상황
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (question[i][j] == answer[i][j]) solution[i][j] = true;
                else solution[i][j] = false;
            }
        }
        System.out.println(change(solution, 0));
    }

    //전부 true인지 확인
    public static boolean check(boolean[][] solution) {
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                if (!solution[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    //F이면 1->0, 0->1 돌려주기
    public static int change(boolean[][] solution, int cnt) {
        if (solution.length >= 3 && solution[0].length >= 3) { //3행 3열 보다 클때
            for (int i = 0; i < solution.length - 2; i++) {
                for (int j = 0; j < solution[i].length - 2; j++) {
                    if (!solution[i][j]) {
                        cnt++;
                        for(int k = 0 ; k < 3 ;k++){
                            for(int l = 0 ; l < 3; l++) {
                                solution[i+k][j+l] = !solution[i+k][j+l];
                            }
                        }
                        if (check(solution)) return cnt;
                    }
                }
            }
        }else {//3행 3열 보다 작을때
            if(check(solution)) return cnt;
        }
        return -1;
    }
}
