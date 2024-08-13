package 조건문;

import java.util.Scanner;

public class Main2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (0 <= h && h <= 23) {
            if (0 <= m && m <= 59) {

                if (m - 45 < 0 && h - 1 >= 0) {
                    System.out.print(h - 1 + " " + (60 + (m - 45)));

                } else if (m - 45 < 0 && h - 1 <= 0) {
                    System.out.print(24 - (h + 1) + " " + (60 + (m - 45)));

                } else if (m - 45 >= 0) {
                    System.out.print(h + " " + (m - 45));

                }

            }

        }
    }
}
