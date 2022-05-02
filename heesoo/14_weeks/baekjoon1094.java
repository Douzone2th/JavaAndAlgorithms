import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1094 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.parseInt(br.readLine());

		int count = 0;
		int num = 64;
		int result = 0;

		while (num > 1) {
			num = num / 2;
			if (result + num <= X) {
				if (X == num * 2) {
					count++;
					break;
				} else {

					result += num;
					count++;
				}
			}

		}

		System.out.println(count);
	}
}
