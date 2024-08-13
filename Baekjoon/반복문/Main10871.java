import java.util.Scanner;

public class Main10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n개로 이루어진 수열 10
        int x = sc.nextInt(); // x보다 작은 수 출력 5이면 5작은수 = 1 4 2 3
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            if (a[j] < x)
                System.out.print(a[j] + " ");
        }
    }

}
