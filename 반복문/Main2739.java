import java.util.Scanner;

public class Main2739 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int m = 1; m < 10; m++) {
            {

                System.out.printf("%d * %d = %d", n, m, n * m);
            }
            System.out.println();
        }

    }
}