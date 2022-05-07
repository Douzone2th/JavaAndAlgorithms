package weeks_15_구현;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 알고리즘 2108번 : 통계학
public class Baekjoon_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //홀수
        int N = Integer.parseInt(br.readLine());
        int avg = 0;
        int mid = 0;
        int mode = 0;
        int size = 0;
        int sum = 0;

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        avg = (int) (Math.round(sum / (double) N));
        mid = arr[N / 2];
        mode = mode(arr, N);
        size = arr[N - 1] - arr[0];
        System.out.println(avg);
        System.out.println(mid);
        System.out.println(mode);
        System.out.println(size);
    }

    // 최빈값 찾기
    public static int mode(int arr[], int N) {
        // 빈도수가 같았던 적이 있다면 false
        boolean flag = false;
        int mode_max = 0;
        int mode = 10000;

        for (int i = 0; i < N; i++) {
            int jump = 0;    // 동일한 수가 나온만큼 i 값 jump 시킬 변수
            int count = 1;
            int i_value = arr[i];

            for (int j = i + 1; j < N; j++) {
                // 연속해서 같은 값이 안나오면 break
                if (i_value != arr[j]) {
                    break;
                }
                //같은값이면 개수 1증가
                count++;
                //동일한 수가 나온 jump 1증가
                jump++;
            }
            // 최빈값 개수가 더큰 경우가 있다면
            if (count > mode_max) {
                mode_max = count;
                mode = i_value;
                flag = true;
            } else if (count == mode_max && flag == true) { // 최빈값 개수가 똑같고,
                mode = i_value;
                flag = false;
            }
            // 동일한 수가 나왔을때까지 jump
            i += jump;
        }
        return mode;
    }
}
