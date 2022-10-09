public class Main369_02 {
    public static void main(String[] args) {
        int x;

        for (x = 1; x < 100; x++) {
            if (x / 10 == 3 && x % 3 == 0 && x != 30) {
                System.out.print(x + " 짝짝짝, ");
            } else if (x / 10 == 6 && x % 3 == 0 && x != 60) {
                System.out.print(x + " 짝짝짝, ");
            } else if (x / 10 == 9 && x % 3 == 0 && x != 90) {
                System.out.print(x + " 짝짝짝, ");
            } else if (x % 10 == 3 || x == 30) {
                System.out.print(x + " 짝, ");
            } else if (x % 10 == 6 || x == 60) {
                System.out.print(x + " 짝, ");
            } else if (x % 10 == 9 || x == 90) {
                System.out.print(x + " 짝, ");
            }
        }
    }
}

// {
// System.out.print(x + " ㅉ, ");
// } else if (x == 30) {
// System.out.print(x + " ㅉ, ");
// } else if (x == 60) {
// System.out.print(x + " ㅉ, ");
// } else if (x == 90) {
// System.out.print(x + " ㅉ, ");
// }