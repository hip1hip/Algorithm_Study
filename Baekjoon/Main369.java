public class Main369 {
    public static void main(String[] args) {
        int x;
        int y;

        for (x = 1; x < 100; x++) {
            if (x / 10 == 3 && x % 3 == 0 && x != 30) {
                System.out.print(x + " 짝짝짝, ");
            } else if (x / 10 == 6 && x % 3 == 0) {
                System.out.print(x + " 짝짝짝, ");
            } else if (x / 10 == 9 && x % 3 == 0) {
                System.out.print(x + " 짝짝짝, ");
            } else if (x % 3 == 0) {
                System.out.print(x + " ㅉ, ");
            }

        }
    }
}

// x / 3 == 11 && x / 3 == 12 && x / 3 == 13
// x / 3 == 11 && x / 3 == 12 && x / 3 == 13 && x / 3 == 21 && x / 3 == 22 && x
// / 3 == 23 && x / 3 == 31
// && x / 3 == 32 && x / 3 == 33
// x = 11; x<14; x++
// x / 3 == 11 || x / 3 == 12 || x / 3 == 13 || x / 3 == 21 || x / 3 == 22 || x
// / 3 == 23
// || x / 3 == 31 || x / 3 == 32 || x / 3 == 33