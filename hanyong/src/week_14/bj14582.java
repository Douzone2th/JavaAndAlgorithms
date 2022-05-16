package week_14;

    import java.io.*;
    import java.util.StringTokenizer;

    public class bj14582 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] My = new int[9];
            int[] Opponent = new int[9];
            int myScore = 0;
            int opponentScore = 0;
            boolean flag = false;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int i = 0; i < 9; i++) {
                My[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine()," ");
            for (int i = 0; i < 9; i++) {
                Opponent[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < 9; i++) {
                myScore += My[i];
                if(myScore>opponentScore){
                    flag = true;
                }
                opponentScore += Opponent[i];
            }
            if(flag == true){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
