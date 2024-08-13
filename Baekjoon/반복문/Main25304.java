import java.util.Scanner;

public class Main25304 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 총 금액
        int n = sc.nextInt(); // 갯수 4
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            sum += (a * b);

        }
        if (sum == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
