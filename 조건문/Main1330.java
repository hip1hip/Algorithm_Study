package 조건문;

import java.net.Socket;
import java.util.Scanner;

public class Main1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        if (-10000 <= a && a <= 100000) {
            if (-10000 <= b && b <= 100000) {
                if (a < b) {
                    System.out.println("<");
                } else if (a > b) {
                    System.out.println(">");
                } else {
                    System.out.println("==");
                }
            }
        }

    }

}
