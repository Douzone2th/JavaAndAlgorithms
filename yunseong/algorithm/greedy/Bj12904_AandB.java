package algorithm.greedy;


import java.util.Scanner;

public class Bj12904_AandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();
        String a = sc.nextLine();

        while(true) {
            if(a.length() == q.length()) {
                System.out.println(check(a,q));
                break;
            }
            if(a.charAt(a.length()-1)=='A'){
                a = a.substring(0,a.length()-1);
            }else{
                a = a.substring(0,a.length()-1);
                a = new StringBuffer(a).reverse().toString();
            }
        }

    }
    public static int check(String a, String q) {
        if(a.equals(q)) return 1;
        else return 0;
    }
}
