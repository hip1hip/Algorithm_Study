package 조건문;

import java.util.Scanner;

public class sky {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M < 60 && M >= 45) {
            System.out.print(H + " ");
            System.out.print(M - 45);
        }

        if (M >= 0 && M < 45) {
            {
                if (H > 0 && H < 24)
                    System.out.print((H - 1) + " ");

                if (H == 0)
                    System.out.print("23 ");
            }

            System.out.print(M + 60 - 45);
        }
    }
}