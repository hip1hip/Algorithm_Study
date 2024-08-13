import java.util.*;

public class Main40430 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // if (2 <= int a <= 10000 && 2 <= b <= 10000) {

        System.out.println("답 : " + (a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
        System.out.println();
        System.out.println((a % c));
        System.out.println((b % c));

    }

}
