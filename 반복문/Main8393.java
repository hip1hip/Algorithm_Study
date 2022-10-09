import java.util.Scanner;

public class Main8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum_n = 0;
        int n = sc.nextInt();

        for (int sum = 1; sum <= n; sum++) {

            sum_n += sum;

        }
        System.out.println(sum_n);
    }
}
