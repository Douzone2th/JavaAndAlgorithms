package week_13;

    import java.io.*;

    public class bj1094 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int staff = 64;
            int count = 0;
            int length = Integer.parseInt(br.readLine());
            while (length > 0) {
                if (staff > length) {
                    staff /= 2;

                } else {
                    length -= staff;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
